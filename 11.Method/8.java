package java_tutorials;

import java.io.*; // 무시

public class Method {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";

		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);

		try {   //무시
			      // 다음 행은 out.txt라는 파일에
			      // numbering 메소드가 반환한 값을 저장합니다.
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch(IOException e) {
		}	      // 무시

	}

}
