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
	void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
    }
}

public class ExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
