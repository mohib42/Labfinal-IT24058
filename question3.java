abstract class Shape {
    abstract double area();
}


interface Drawable {
    void draw();
}


class Circle extends Shape implements Drawable {

    double radius = 5;

    
    double area() {
        return 3.1416 * radius * radius;
    }


    public void draw() {
        System.out.println("Drawing Circle");
    }
}


class Rectangle extends Shape implements Drawable {

    double length = 4;
    double width = 6;

     
    double area() {
        return length * width;
    }

    
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Question3 {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());

        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();

        d1.draw();
        d2.draw();
    }
}

