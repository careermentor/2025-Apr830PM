package oopsConcept;

public class QA1
{
	
	public QA1()
	{
		System.out.println("Constructor");
	}

	public void sum(int a, int b) 
	{
		int c = a + b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, int b, int c) 
	{
		int d = a + b + c;
		System.out.println("sum of a&b&C: " + d);
	}
	
	public void sum(int a, float b) 
	{
		float c = a + b;
		System.out.println("sum of a&b: " + c);
	}

	public static void main(String[] args) {

		QA1 q1 = new QA1();
		
		q1.sum(20, 30);
		
		q1.sum(20, 30.5f);
		
		q1.sum(20, 30, 40);
		
		DemoEncapsulation de = new DemoEncapsulation();
		//System.out.println(de.a);

		de.getA();
		
	}

}
