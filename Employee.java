import java.util.*;

    void main() {
   Employee e1= new Employee("Arun", "1,00,000", "Junior Analist");
        
        e1.display();
        Employee e2= new Employee("Argith", "2,25,000","Senior Team Manager");
        
        e2.display();
        Employee e3= new Employee("Shramik","3,50,000","HR");
       
        e3.display();
    }



class Employee {
    String name;
    String salary;
    String type;
    Employee(String name, String salary, String type){
        this.name = name;
        this.salary = salary;
        this.type = type;
        this.display();
    }
void display ()
{
    IO.println("Name: " +name);
     IO.println("Salary: " +salary);
     IO.println("Type: " +type);
}
}