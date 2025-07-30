package Assignment5;

import java.util.Scanner;

public class TicketBookingApp {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine(); 
	        String[] parts = input.split(",");

	        String stageEvent = parts[0];
	        String customer = parts[1];
	        int noOfSeats = Integer.parseInt(parts[2]);

	        TicketsBooking booking = new TicketsBooking(stageEvent, customer, noOfSeats);

	        int paymentMode = Integer.parseInt(sc.nextLine());

	        booking.displayDetails();

	        switch (paymentMode) {
	            case 1:
	                double cashAmount = Double.parseDouble(sc.nextLine());
	                booking.makePayment(cashAmount);
	                break;

	            case 2:
	                double walletAmount = Double.parseDouble(sc.nextLine());
	                String walletNumber = sc.nextLine();
	                booking.makePayment(walletAmount, walletNumber);
	                break;

	            case 3:
	                String cardHolder = sc.nextLine();
	                double cardAmount = Double.parseDouble(sc.nextLine());
	                String cardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                booking.makePayment(cardHolder, cardAmount, cardType, ccv);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }
	    }
	}

