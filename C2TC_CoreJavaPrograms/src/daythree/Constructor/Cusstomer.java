package daythree.Constructor;

public class Cusstomer {

	private String CName;
	 private int CId;
	 private String City;
	 
	// Default Constructor
	public Cusstomer() {
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	//use of this keyword
	public Cusstomer(String customerName, int customerId, String customerCity) {
		
		this(); //calling default constructor
		
		System.out.println("Parameterized Constructor");
		this.CName = customerName;
		this.CId = customerId;
		this.City = customerCity;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Cusstomer [CName=" + CName + ", CId=" + CId + ", City=" + City + "]";
	}
	
	
}
