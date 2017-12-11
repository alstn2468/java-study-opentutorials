package java_tutorials;

public class Condition {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing")) {
			if(password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}
	}

}
