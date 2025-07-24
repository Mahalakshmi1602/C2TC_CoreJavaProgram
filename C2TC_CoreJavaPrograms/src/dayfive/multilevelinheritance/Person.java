package dayfive.multilevelinheritance;

import java.sql.Date;

public class Person {

	private String name;
	private long contactNo;
	private Date dob;

	public Person(String name, long conatctNo, Date dateOfBirth) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Person() {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dob=" + dob + "]";
	}
	
	
}
