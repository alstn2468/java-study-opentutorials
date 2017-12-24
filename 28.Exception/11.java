package java_tutorials;

class B {
    void run() {
    }
}

class C {
    void run() {
        B b = new B();
        b.run();
    }
}

public class ExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
        c.run();


	}

}
