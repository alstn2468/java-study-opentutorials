package java_tutorials;

class A{
	public String x() {
		return "A.x";
	}
}

class B extends A {
	public String x() {
		return "B.x";
	}

	public String y() {
		return "y";
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x());

	}

}
