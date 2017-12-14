package java_tutorials;

public class Logical_Operator {

	public static void main(String[] args) {
		if(true || true) {			// 조건 판단 결과 : 참
			System.out.println(1);
		}

		if(true || false) {			// 조건 판단 결과 : 참
			System.out.println(2);
		}

		if(false || true) {			// 조건 판단 결과 : 참
			System.out.println(3);
		}

		if(false || false) {		// 조건 판단 결과 : 거짓
			System.out.println(4);
		}

	}

}
