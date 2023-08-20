package org.example.oop;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Area is: " + rectangle.area());
        System.out.println("Number of Rectangles: " + Rectangle.getNumRectangles());
        System.out.println("The Perimeter is " + rectangle.perimeter());
    }
}
