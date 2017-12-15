package java_tutorials;

import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();

	}

}
