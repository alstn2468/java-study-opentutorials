package java_tutorials;

import java.io.IOException;

class E {
    void throwArithmeticException() {
        throw new ArithmeticException();
    }

    void throwIOException1() {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void throwIOException2() throws IOException {
        throw new IOException();
    }

}

public class ExceptionDemo {

	public static void main(String[] args) {


	}

}
