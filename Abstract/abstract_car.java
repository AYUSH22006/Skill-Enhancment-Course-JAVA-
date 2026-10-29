abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Starts with the key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike stats with a button");
    }
}

void main() {
    Car c = new Car();
    c.start();

    Bike b = new Bike();
    b.start();
}

