package oopsConcept;

public class Tester2 extends DemoAbsClass
{

	
	public void username() {
		
		System.out.println("here is my username");
		
	}

	
	public void password() {
		
		
		System.out.println("here is my password");
	}

	
	public static void main(String[] args) {
		
		Tester2 t2 = new Tester2();
		t2.meth1();
		t2.username();
		t2.password();
		
	}
	
}
