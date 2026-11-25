public class hierarchical_employ {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "DSU";
        t.displayCompany();
        t.teach();

        Developer d = new Developer();
        d.name = "NVIDIA";
        d.displayCompany();
        d.code();
        
    }
}


class Employ {
    String name = "Not-Defined";
    void displayCompany() {
        System.out.println("Company: " + name);
    }
}

class Teacher extends Employ {
    void teach() {
        System.out.println("Students i am teaching");
    }
}

class Developer extends Employ {
    void code() {
        System.out.println("I am writing code don't disturb");
    }
}
