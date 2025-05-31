package secondpkg;

import firstpkg.Calculations;

public class SecondClass 
{

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;

		int sum = a + b;
		int subs = a-b;
		
		System.out.println(sum);
		System.out.println(subs);
		
		
		Calculations abc = new Calculations();
		abc.addition();
		abc.substrcation();

	}

}
