abstract class Shape {
    abstract double calculateArea();
    void display() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return radius*radius;
    }
}

class Rectangle extends Shape {
    double l, b;
    Rectangle(int length, int breath) {
        this.l = length;
        this.b = breath;
    }
    double calculateArea() {
        return l*b;
    }
}

void main() {
    Circle c = new Circle(7);
    c.display();

    Rectangle r = new Rectangle(10, 5);
    r.display();
}