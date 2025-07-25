package daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		Employee e = new Employee("Maha", 101);
		System.out.println(e);
		
		
		e = new Employee("Deepika", 102);
		System.out.println(e);
	}
}
