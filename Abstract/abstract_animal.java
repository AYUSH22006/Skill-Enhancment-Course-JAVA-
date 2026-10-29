abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is Sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

void main() {
    Dog d = new Dog();
    d.sleep();
    d.sound();
}