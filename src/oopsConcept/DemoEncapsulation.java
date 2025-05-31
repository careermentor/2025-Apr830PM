package oopsConcept;

public class DemoEncapsulation 
{

	private int a = 20;
	private String name;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getA() 
	{
		System.out.println(a);
		return a;
	}


	public void setA(int a) 
	{
		this.a = a;
	}

	
	
	
	
	
	
	
	
	
	
	
	

	public void printVal()
	{
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	
	public static void main(String[] args) {
		
		DemoEncapsulation de = new DemoEncapsulation();
		de.printVal();
	}
}
