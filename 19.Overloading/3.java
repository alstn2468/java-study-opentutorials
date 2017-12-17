package java_tutorials;

public class Overloading {

	void A() {
		System.out.println("void A()");
	}

	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}

	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}

	// int A(){
	//		System.out.println("void A()");
	// }

	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.A();
		od.A(1);
		od.A("coding everybody");

	}

}
