package oopsConcept;

public class QA2 implements QA1I
{

	public QA2()
	{
		System.out.println("Constructor");
	}
	
	public void sum(int a, int b) 
	{
		int c = a*a + b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void subs(int a, int b) 
	{
		int c = a - b;
		System.out.println("substraction of a&b: " + c);
	}

	public static void main(String[] args) {

		QA2 q2 = new QA2();
		q2.subs(20, 30);
		
		q2.sum(20, 30);
		
		q2.qa1m();
	}

	
	
	public void qa1m() {
	System.out.println("QA1I Method");
		
	}
	
}
