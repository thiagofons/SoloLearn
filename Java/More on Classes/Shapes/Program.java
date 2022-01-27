package Shapes;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
    Square(int x){
        this.width = x;
    }
    
    public void area(){
        System.out.println(this.width * this.width);
    }
}

class Circle extends Shape{
    Circle(int x){
        this.width = x;
    }
    
    public void area(){
        System.out.println(this.width * this.width * Math.PI);
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