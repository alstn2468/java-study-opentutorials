package java_tutorials;

class Calculator {
	static final double PI = 3.14;
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Final {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		// Calculaotr.PI = 10;

	}

}
