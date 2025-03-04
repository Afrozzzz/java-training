package MovieTicketBooking;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;
 
public class AdminFunctionality {
 
    public static void showAdminMenu() {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Create Tables");
            System.out.println("2. Insert Data");
            System.out.println("3. Add Movie Manually");
            System.out.println("4. Add Show Manually");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
 
            switch (choice) {
                case 1:
                    DatabaseTables.createTables();
                    break;
                case 2:
                    InsertData.insertMovies();
                    InsertData.insertShows();
                    break;
                case 3:
                    addMovieManually(scanner);
                    break;
                case 4:
                    addShowManually(scanner);
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
 
    private static void addMovieManually(Scanner scanner) {
        try {
            System.out.print("Enter movie title: ");
            String title = scanner.nextLine();
            System.out.print("Enter movie genre: ");
            String genre = scanner.nextLine();
            System.out.print("Enter movie duration (in minutes): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // Consume newline
 
            InsertData.insertMovie(title, genre, duration);
            System.out.println("Movie added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    private static void addShowManually(Scanner scanner) {
        try {
            System.out.print("Enter movie ID: ");
            int movieId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter show time (YYYY-MM-DDTHH:MM): ");
            LocalDateTime showTime = LocalDateTime.parse(scanner.nextLine());
            System.out.print("Enter available seats: ");
            int availableSeats = scanner.nextInt();
            scanner.nextLine(); // Consume newline
 
            InsertData.insertShow(movieId, showTime, availableSeats);
            System.out.println("Show added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}