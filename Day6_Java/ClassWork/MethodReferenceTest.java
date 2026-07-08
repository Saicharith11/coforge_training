<<<<<<< HEAD
package com.coforge.day6;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

public class MethodReferenceTest {
	void myInstanceMethod() {
		System.out.println("Example for instance method reference");
	}
	
	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
	}
	
	MethodReferenceTest() {
		System.out.println("Constructor");
		
	}
	public static void main(String[] args) {
		MethodReferenceTest obj = new MethodReferenceTest ();
		MyReference reference = obj::myInstanceMethod;
		reference.showMessage();
		
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();

		
		reference = MethodReferenceTest::new;
		reference.showMessage();
	}
}

=======
package com.coforge.day6;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

public class MethodReferenceTest {
	void myInstanceMethod() {
		System.out.println("Example for instance method reference");
	}
	
	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
	}
	
	MethodReferenceTest() {
		System.out.println("Constructor");
		
	}
	public static void main(String[] args) {
		MethodReferenceTest obj = new MethodReferenceTest ();
		MyReference reference = obj::myInstanceMethod;
		reference.showMessage();
		
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();

		
		reference = MethodReferenceTest::new;
		reference.showMessage();
	}
}

>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
