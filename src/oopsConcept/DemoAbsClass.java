package oopsConcept;

public abstract class DemoAbsClass 
{
	int a =20;
	//a=30;

	public void meth1()  //concrete
	{
		final int a =20;
	//	a=30;
		System.out.println("this is concrete method");
		System.out.println(a);
	}
	
	public abstract void username();
	
	public abstract void password();
	
	
	
	
}
