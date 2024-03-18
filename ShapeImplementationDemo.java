/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapeimplementationdemo;

/**
 *
 * @author nayan
 */
abstract class Shape {
    public abstract double calculateArea();
    
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea(){
        return length * width;
    }
    
    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    public double calculatePerimeter(){
        return Math.PI * radius;
    }
}
public class ShapeImplementationDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle: ");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        Circle circle = new Circle(4);
        System.out.println("\nCircle: ");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
