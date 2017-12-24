package java_tutorials;

import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);

	}

}
