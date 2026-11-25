public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "red");
    }
}

class Car {
    String name, colour;

    Car(String name, String colour){
        this.name = name;
        this.colour = colour;
        this.display();
    }
     void display() {
        IO.println("Name: " + name + " | Colour: " + colour);
    }
}
