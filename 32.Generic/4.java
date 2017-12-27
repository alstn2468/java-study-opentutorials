package java_tutorials;

class StudentInfo {
    public int grade;
    StudentInfo(int grade) {
    	this.grade = grade;
    }
}

class EmployeeInfo {
    public int rank;
    EmployeeInfo(int rank) {
    	this.rank = rank;
    }
}

class Person<T> {
	public T info;
	Person(T info) {
		this.info = info;
	}
}

public class Generic {

	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo ei1 = p1.info;
		System.out.println(ei1.rank);	// 성공

		Person<String> p2 = new Person(String)("부장");
		String ei2 = p2.info;
		System.out.println(ei2.rank); // 컴파일 실패

	}

}
