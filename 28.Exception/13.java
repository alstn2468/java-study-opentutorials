package java_tutorials;

import java.io.*;

class B {
	void run() throws IOException, FileNotFoundException {
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }

}

class C {
	void run() {
        B b = new B();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


public class ExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
        c.run();

	}

}
