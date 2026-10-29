abstract class Employ {
    abstract void calculateSalary();
    void companyName() {
        System.out.println("ABC Technologies");
    }
}

class fullTimeEmploy extends Employ {
    void calculateSalary() {
        System.out.println("FullTime Salary is 40k");
    }
}

class partTimeEmploy extends Employ {
    void calculateSalary() {
        System.out.println("PartTime Salary is 15k");
    }
}

void main() {
    fullTimeEmploy f = new fullTimeEmploy();
    f.calculateSalary();
    f.companyName();

    partTimeEmploy p = new partTimeEmploy();
    p.calculateSalary();
    p.companyName();
}