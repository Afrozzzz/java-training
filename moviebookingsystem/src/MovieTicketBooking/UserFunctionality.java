package MovieTicketBooking;

import java.util.Scanner;

public class UserFunctionality {
 
    public static void showUserMenu(String username){
       Scanner scanner=new Scanner(System.in);
 
       while(true){
           System.out.println("User Menu:");
           System.out.println("1. Show available movies");
           System.out.println("2. Book ticket");
           System.out.println("3. Booking confirmation");
           System.out.println("4. Ticket cancellation");
           System.out.println("5. Logout");
           int choice=scanner.nextInt();
           scanner.nextLine(); // Consume newline
 
           switch(choice){
               case 1:
                   ShowAvailableMovies.showMoviesAndShows();
                   break;
               case 2:
                   TicketBooking.bookTicket(scanner);
                   break;
               case 3:
                   BookingConfirmation.confirmBooking(scanner);
                   break;
               case 4:
                   TicketCancellation.cancelTicket(scanner);
                   break;
               case 5:
                   return;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       }
   }
}