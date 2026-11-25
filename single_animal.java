class Animal {
    void eat() {
        IO.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        IO.println("Dog is barking");
    }
}

void main() {
    Dog d = new Dog();
    d.eat();
    d.bark();
}