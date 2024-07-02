package javacore.nelio.exercicios.poo.rectangle.domain;

public class Rectangle {
    public double width;
    public double height;
    private double area;
    private double perimeter;
    private double diagonal;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void area() {
        this.area = width * height;
    }

    public void perimeter() {
       this.perimeter = 2 * (width + height);
    }

    public void diagonal() {
        this.diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    public void print() {
        area();
        perimeter();
        diagonal();
        System.out.printf("Area: %.2f", area);
        System.out.printf("\nPerimeter: %.2f", perimeter);
        System.out.printf("\nDiagonal: %.2f", diagonal);
    }
}
