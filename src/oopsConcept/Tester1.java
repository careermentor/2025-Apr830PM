package oopsConcept;

public class Tester1 extends DemoAbsClass
{

	
	public void username() {
		
		System.out.println("here is my username");
		
	}

	
	public void password() {
		
		
		System.out.println("here is my password");
	}

	
	public static void main(String[] args) {
		
		Tester1 t1 = new Tester1();
		t1.meth1();
		t1.username();
		t1.password();
		
	}
	
}
