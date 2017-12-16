package java_tutorials;

class Calculator {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOperands(20, 10);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();

	}

}
