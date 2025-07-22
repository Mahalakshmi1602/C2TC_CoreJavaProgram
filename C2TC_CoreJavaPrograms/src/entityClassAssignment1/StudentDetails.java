package entityClassAssignment1;

import day1.entity.Customer;

public class StudentDetails {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setSid(101);
		s1.setSname("raja");
		s1.setSage(21);
		System.out.println(s1);
		
		Students s2 = new Students();
		s2.setSid(102);
		s2.setSname("Maha");
		s2.setSage(20);
		System.out.println(s2);

	}

}
