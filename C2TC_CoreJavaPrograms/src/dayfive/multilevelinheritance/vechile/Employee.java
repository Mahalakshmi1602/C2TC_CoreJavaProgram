package dayfive.multilevelinheritance.vechile;

import java.sql.Date;

public class Employee extends Person {
	private String deptName;
	private double baseSalary;
	
	public Employee() {}

	public Employee(String name, long contactNo, Date dob, String deptName, double baseSalary) {
		super(name, contactNo, dob);
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
	}
	
	
}