package day2.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		System.out.println("Enter name: ");
		name= br.readLine();
		
		int age;
		System.out.println("Enter age: ");
		age = Integer.parseInt(br.readLine());
		
		float avg;
		System.out.println("Enter values: ");
		avg = Float.parseFloat(br.readLine());
		
		System.out.println("NAME:"+name+" AGE:"+age+" AVG:"+avg);
	}

}
