public class multilevel_person {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, "HR");
        m.displayPerson(); 
        m.displayEmployee();
        m.displayManager();
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Person Name: " + name);
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}