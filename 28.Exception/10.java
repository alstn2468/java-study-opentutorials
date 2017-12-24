package java_tutorials;

import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);

	}

}
