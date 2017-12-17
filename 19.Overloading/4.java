package java_tutorials;

public class Overloading {

	void A(String args1, String arg2) {
		System.out.println("sub class : void A(String args1, String args2)");
	}

	void A() {
		System.out.println("sub class : void A()");
	}

	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}

	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}

	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody", "coding everybody");

	}

}
