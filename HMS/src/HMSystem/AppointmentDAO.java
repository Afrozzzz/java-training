package HMSystem;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
public class AppointmentDAO {
 
    public void bookAppointment(Appointment appointment) {
        try {
            if (!isPatientRegistered(appointment.getPatient_id())) {
                System.out.println("Patient ID not registered.");
            }
            if (!isDoctorAvailable(appointment.getDoctor_id())) {
                System.out.println("Doctor ID not available.");
            }
 
            String query = "INSERT INTO Appointment (patient_id, doctor_id, appointment_date, reason) VALUES (?, ?, ?, ?)";
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement psmt = conn.prepareStatement(query)) {
 
                psmt.setInt(1, appointment.getPatient_id());
                psmt.setInt(2, appointment.getDoctor_id());
                psmt.setString(3, appointment.getAppointment_date());
                psmt.setString(4, appointment.getReason());
 
                psmt.executeUpdate();
                System.out.println("Appointment booked successfully.");
            } catch (SQLException e) {
                System.err.println("Error booking appointment: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }
 
    public List<Appointment> getAllAppointments() throws SQLException {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT * FROM Appointment";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {
 
            while (rs.next()) {
                Appointment appointment = new Appointment(
                        rs.getInt("id"),
                        rs.getInt("patient_id"),
                        rs.getInt("doctor_id"),
                        rs.getString("appointment_date"),
                        rs.getString("reason")
                );
                appointments.add(appointment);
            }
        }
        return appointments;
    }
 
    public void cancelAppointment(int id) throws SQLException {
        String query = "DELETE FROM Appointment WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, id);
            psmt.executeUpdate();
            System.out.println("Appointment canceled successfully.");
        }
    }
 
    private boolean isPatientRegistered(int patientId) throws SQLException {
        String query = "SELECT 1 FROM Patient WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, patientId);
            try (ResultSet rs = psmt.executeQuery()) {
                return rs.next();
            }
        }
    }
 
    private boolean isDoctorAvailable(int doctorId) throws SQLException {
        String query = "SELECT 1 FROM Doctor WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, doctorId);
            try (ResultSet rs = psmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}