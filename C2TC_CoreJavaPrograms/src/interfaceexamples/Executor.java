package interfaceexamples;

public class Executor {

	public static void main(String[] args) {
		
		//college reference
		College c1;
		
		//cse reference
		c1 = new CseStudents();
		c1.session();
		
		//it students
		c1 = new ItStudents();
		c1.session();

	}

}
