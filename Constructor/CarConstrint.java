import java.util.*;

    void main() {
        Car c1= new Car("BMW", "730d", "Sedan");
        
        c1.display();
        Car c2= new Car("Benz", "G63","Suv");
        
        c2.display();
        Car c3= new Car("Audi","R8","Sports");
       
        c3.display();
    }



class Car {
    String name;
    String model;
    String type;
    Car(String name, String model, String type){
        this.name = name;
        this.model = model;
        this.type = type;
        this.display();
    }
void display ()
{
    IO.println("Name: " +name);
     IO.println("Model: " +model);
     IO.println("Type: " +type);
}
}
