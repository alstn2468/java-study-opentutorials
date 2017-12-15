package java_tutorials;

class C1 {
	static int static_variable = 1;
	int instance_variable = 2;

	static void static_static() {
		System.out.println(static_variable);
	}

	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
		// System.out.println(instance_variable);
	}

	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근할 수 있다.
		System.out.println(static_variable);
	}

	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class Class_Instance {

	public static void main(String[] args) {
		C1 c = new C1();

		// 인스턴스를 이용해 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.static_static();

		// 인스턴스를 이용해 정적 메소드에 접근 -> 성공
		// 정적 메소드가 인스턴스 변수에 접근 -> 실패
		c.static_instance();

		// 인스턴스를 이용해 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instance_static();

		// 인스턴스를 이용해 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		c.instance_instance();

		// 클래스를 이용해 클래스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		C1.static_static();

		// 클래스를 이용해 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.static_instance();

		// 클래스를 이용해 인스턴스 메소드에 접근 -> 실패
		// C1.instance_static();

		// 클래스를 이용해 인스턴스 메소드에 접근 -> 실패
		// C1.instance_instance();

	}

}
