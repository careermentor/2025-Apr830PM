package secondpkg;



import firstpkg.Calculator;

public class FirstClass 
{
	
	int a=10;
	float b = 10.5f;
	char c = 'X';
	
	boolean d = true;
	
	String e = "Java";
	
	
	public void printVal()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
	}
	
	public static void main(String[] args) 
	{
	
		FirstClass obj = new FirstClass();
		
		obj.printVal();
		
		
		Calculator cal = new Calculator(20,30);
		cal.sum();
		
		System.out.println(cal.x);
		
	}
	
	
	
	
}
