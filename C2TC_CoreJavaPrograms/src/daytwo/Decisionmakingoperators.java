package daytwo;

public class Decisionmakingoperators {
	public static void main(String[] args) {
		int x = 12, y = 6;
		int a = 10;
		int b = 8;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
