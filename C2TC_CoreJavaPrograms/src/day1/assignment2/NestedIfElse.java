package day1.assignment2;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		System.out.print("The largest number is: ");
		if (a > b) {
			if (a > c)
				System.out.print(a);
			else
				System.out.print(c);
		} else {
			if (c > b)
				System.out.print(c);
			else
				System.out.print(b);
		}

	}
}
