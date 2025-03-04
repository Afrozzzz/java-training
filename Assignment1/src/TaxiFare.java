import java.util.Scanner;
public class TaxiFare {

    
    public static double calFare(double distance, String taxiType) {
        double ratePerKm = 0;

                //  fare based on taxi type
        if (taxiType.equalsIgnoreCase("suv")) {
                ratePerKm = 25;
        } else if (taxiType.equalsIgnoreCase("premium")) {
                ratePerKm = 20;
        } else {
            ratePerKm = 10;
            
            
        }

        return distance *  ratePerKm;
    }

    public static double  applySurcharge(double fare, boolean isPeakTime) {
        if (isPeakTime) {
            fare += fare * 0.10;
            
           
        }
        return fare;
    }

      public static void main(String[] args) {
        Scanner   scanner = new Scanner(System.in);

                    //  input
        System.out.print("Enter distance in kilometers: ");
             double distance = scanner.nextDouble();

          System.out.print("Enter taxi type (standard, premium, suv): ");
        scanner.nextLine(); 
           String taxiType = scanner.nextLine();

        System.out.print("Is it peak time (true/false): ");
              boolean isPeakTime = scanner.nextBoolean();

        //  base fare
        
           double fare = calFare(distance, taxiType);

                  //  if it's peak time
        fare = applySurcharge(fare, isPeakTime);

         //  total 
        System.out.println("Total fare: " + fare + " rupees");

        scanner.close();
    }
}