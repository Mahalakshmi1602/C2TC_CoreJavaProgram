package day1.assignment2;

public class ForLoopDemo {

	public static void main(String[] args) {
		int a[]= {11,12,13,14,15};	

		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'M','a','h','a'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"Java","programming","learning"};

		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
	}
}
