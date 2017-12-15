package java_tutorials;

class Calculator2 {
	static double PI = 3.14;
	// 클래스 변수인 base가 추가됐다.
	static int base = 0;
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		// 더하기에 base 값을 포함 시킨다.
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		// 평균값에 base 값을 포함 시킨다.
		System.out.println((this.left + this.right + base) / 2);
	}
}

public class Class_Instance {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		// 30출력
		c1.sum();

		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		// 60출력
		c2.sum();

		// 클래스 변수 base의 값을 10으로 지정했다.
		Calculator2.base = 10;

		// 40출력
		c1.sum();

		// 70출력
		c2.sum();
	}

}
