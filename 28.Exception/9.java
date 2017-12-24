package java_tutorials;

import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String input = bReader.readLine();
        System.out.println(input);

	}

}
