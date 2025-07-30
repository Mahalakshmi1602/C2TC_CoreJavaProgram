package Assignment5;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double costPerHour = Double.parseDouble(sc.nextLine());

        Airface airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

     
        System.out.printf("%.2f\n", airfare.calculateAmount());
        
    }
}
