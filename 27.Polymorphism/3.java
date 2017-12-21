package java_tutorials;

class A{
	public String x() {
		return "x";
	}
}

class B extends A {
	public String y() {
		return "y";
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		A obj = new B();
		obj.x();
		// obj.y();

	}

}
