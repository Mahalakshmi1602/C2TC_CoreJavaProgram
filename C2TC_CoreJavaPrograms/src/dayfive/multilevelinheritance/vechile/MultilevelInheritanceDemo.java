package dayfive.multilevelinheritance.vechile;

import java.sql.Date;

public class MultilevelInheritanceDemo {
	
	public static void main(String[] args) {

		Person p1 = new Person("Maha", 7878767676l, new Date(2002, 12, 16));
		System.out.println(p1);

		p1 = new Employee("Manohar", 8080807070l, new Date(1995, 07, 12), "Sales", 70000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Vimala", 9880807227l, new Date(1988, 15, 02), "Account", 90000, 200,
				"Signing Authority");
		System.out.println(p1);
	}

}