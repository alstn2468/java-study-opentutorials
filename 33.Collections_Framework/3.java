package java_tutorials;

import java.util.ArrayList;

public class Collectons_Framework {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		// arrayObj[2] = "three"; 오류가 발생한다.

		for(int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}

		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");

		for(int i = 0; i <al.size(); i++) {
			String val = al.get(i);
			System.out.println(val);
		}

	}

}
