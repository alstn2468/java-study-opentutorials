package java_tutorials;

class Calculator {
	static double PI = 3.14;
	int left, right;

	public void setOperands(int _left, int _right) {
		left = _left;
		right = _right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Scope {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);

		Calculator c2 = new Calculator();
		System.out.println(c2.PI);

		System.out.println(Calculator.PI);

	}

}
