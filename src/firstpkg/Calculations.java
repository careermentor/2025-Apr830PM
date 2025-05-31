package firstpkg;

import secondpkg.SecondClass;

public class Calculations {

	
	int a = 20;
	
	int b = 30;
	

	public void addition() {

		final int a = 50;
		//a=100;
		int b = 60;
		
		int c = a + b;
		System.out.println("sum of a&b: " + c);
		
		//System.out.println(20+30); //50
		
		//System.out.println(a+b);  //110
		
	//	System.out.println("a"); //a
		
		///System.out.println("a" + b);  //a60
		
	}

	public void substrcation() {

		int c = a - b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		//System.out.println("This is main method");
		
		Calculations cal = new Calculations();
		
		cal.addition();
		cal.substrcation();
		
		
		//SecondClass sc = new SecondClass();
		//sc.main(args);
	}

}
