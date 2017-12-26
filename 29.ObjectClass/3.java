package java_tutorials;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}

class ObjectClass {

    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
