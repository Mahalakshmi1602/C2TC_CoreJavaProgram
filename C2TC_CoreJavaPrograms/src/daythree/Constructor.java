package daythree;

import java.util.Scanner;

public class Constructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;

		System.out.print("Enter Customer Id : ");
		id = sc.nextInt();
		sc.nextLine(); // consume newline

		System.out.print("Enter Customer Name : ");
		name = sc.nextLine();

		System.out.print("Enter Customer City : ");
		city = sc.nextLine();

		System.out.println();
	}
}
