public class single_person {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 92);
        s1.displayName();
        s1.displayMarks();
    }
}


class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

class Student extends Person {
    int marks;
    Student(String name, int marks) {
        super(name);
        this.marks = marks;
    }
    void displayMarks() {
        System.out.println("Student Marks: " + marks);
    }
}