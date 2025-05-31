package oopsConcept;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth1() {
		
		System.out.println("this is method1");
	}

	
	public void meth2() {
		
		System.out.println("this is method1");
		
	}

	public static void main(String[] args) {
		
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.meth1();
		cdi.meth2();
	}
	
}
