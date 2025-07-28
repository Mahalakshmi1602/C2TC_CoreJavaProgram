package polymorphism_override;

public class OverrideDemo {

	public static void main(String[] args) {
		 PLTraining p1 = new PLTraining();
		 p1.session("Full Stack developer");
		 
		 p1 = new JFS();
		 p1.session("Method overriding");
		 
		 p1 = new Python();
		 p1.session("Method overriding");
	}
}
