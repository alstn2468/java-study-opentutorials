package java_tutorials;

class Person<T> {
	public T info;
}

public class Generic {

	public static void main(String[] args) {
		Person<String>  p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();

	}

}
