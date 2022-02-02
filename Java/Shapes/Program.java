package Shapes;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
    public Square(int x){
        this.width = x;
    }
    
    public void area(){
        int area = this.width * this.width;
        System.out.println(area);
    }
}

class Circle extends Shape{
    public Circle(int x){
        this.width = x;
    }
    
    public void area(){
        double area = (double) this.width * this.width * Math.PI;
        System.out.println(area);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);

        a.area();
        b.area();

        sc.close();
    }
}

