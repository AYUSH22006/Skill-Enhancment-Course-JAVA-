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

class Puppy extends Dog {

}

void main() {
    Puppy p = new Puppy();
    p.eat();
    p.bark();
}