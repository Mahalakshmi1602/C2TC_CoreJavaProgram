package daythree.Constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		
		System.out.println(" ");
		
		Cusstomer c1=new Cusstomer(); 
		c1.setCName(name);
		c1.setCId(id);
		c1.setCity(city);
		System.out.println(c1);
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		
		Cusstomer c2=new Cusstomer(name, id, city); 
		System.out.println(c2);
		
		sc.close();
		

	}
}
