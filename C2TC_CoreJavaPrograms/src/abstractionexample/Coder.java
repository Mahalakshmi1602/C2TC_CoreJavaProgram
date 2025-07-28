package abstractionexample;

public abstract class Coder {

	protected static final String wakeup = "5 Am";
	
	//abstract method declared
	abstract public void rules();
	
	//Concrete method 
	public void show() {
		System.out.println("To Become a Coder , Early Morning Pratical needed");
	}
}
