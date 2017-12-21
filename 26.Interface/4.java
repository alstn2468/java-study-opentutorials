package java_tutorials;

class CalculatorDummy implements Calculatable {
	public void setOperands(int first, int second, int third) {

	}

	public int sum() {
		return 60;
	}

	public int avg() {
		return 20;
	}
}


public class Interface {

	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());

	}

}
