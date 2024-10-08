package Projects.Calculator.model;

public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Shape.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }


    @Override
    public String toString() {
        String result = "Circle, ";
        result += ", radius: " + r;
        result += ", area: " + calculateArea();
        result += ", perimeter: " + calculatePerimeter();

        return result;
    }
}
