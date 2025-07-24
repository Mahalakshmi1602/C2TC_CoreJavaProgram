package dayfive.singleinheritance;

public class Student extends Citizen{

	private int rollno;
	private String collegename;
	
	public Student() {
		super();
	}

	public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
		super(name, aadharNo, address, phno); 
		this.rollno = rollNo;
		this.collegename = collegeName;
	}

	public int getRollNo() {
		return rollno;
	}

	public void setRollNo(int rollNo) {
		this.rollno = rollNo;
	}

	public String getCollegeName() {
		return collegename;
	}

	public void setCollegeName(String collegeName) {
		this.collegename = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollno + ", collegeName=" + collegename + ", Name=" + getName()
				+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				
				+ "]";
	}
	
}
