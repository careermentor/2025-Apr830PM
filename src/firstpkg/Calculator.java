package firstpkg;

public class Calculator 
{

	public Calculator()
	{
		int a = 20;
		int b = 30;
		int c  =a+b;
		System.out.println("sum of a&b using constructor: " + c);
		
	}
	
	
	public Calculator(int r, int s)
	{
		int t = r+s;
		System.out.println("addition of r&s: " + t);
	}
	
	public Calculator(int r, float s)
	{
		float t = r+s;
		System.out.println("addition of r&s: " + t);
	}
	
	
	
	int a = 30;
	public int x = 100;
	
	public String sum()
	{
		int a = 20;
		int b = 30;
		
		int c  =a+b;
		
		float d = 20.5f;
		
		String name="Java";
		
		System.out.println("sum of a&b: " + c);
		
		return name;
	}


	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	//int y=40+50
	//y+60
	
	public static void main(String[] args) 
	{
	
		Calculator cal1 = new Calculator(30, 40);
		
		//Calculator cal2 = new Calculator(50,60);
		
		//String abc  =cal.sum();
		
		//System.out.println(abc);
		
		//cal.addition(abc, 40);
		
		int y = cal1.addition(40, 50);
		
		cal1.addition(y, 60);
		
		//System.out.println(cal.x);
		
	}
	
}
