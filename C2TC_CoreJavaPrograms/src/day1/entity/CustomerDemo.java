package day1.entity;

public class CustomerDemo {
		
	public static void main(String[] args) {
		//customer 1
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("raja");
		c1.setCity("Puducherry");
		/*System.out.println("Customer id: "+c1.getCid());
		System.out.println("Customer name: "+c1.getCname());
		System.out.println("Customer city: "+c1.getCity());*/
		
		System.out.println(c1);
		
		//customer 2
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setCname("priya");
		c2.setCity("chennai");
		System.out.println();
		System.out.println(c2);
		

		//customer 3
		Customer c3 = new Customer();
		c3.setCid(103);
		c3.setCname("Maha");
		c3.setCity("Villupuram");
		System.out.println();
		System.out.println(c3);
		
		
		/*System.out.println("Customer id: "+c2.cid);
		System.out.println("Customer name: "+c2.cname);
		System.out.println("Customer city: "+c2.city);
		*/
		
		
	}
}
