package java_tutorials;

public class Scope {
	static int i;		// 전역변수

	static void a() {
		i = 0;
	}

	public static void main(String[] args) {
		for(i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}

	}

}
