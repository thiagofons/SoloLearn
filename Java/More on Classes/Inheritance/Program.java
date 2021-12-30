package Inheritance;

public class Program {
    public static void main(String[] args){
        B obj = new B();
    }
}

class A{
    public A(){
        System.out.println("New A");
    }
}

class B{
    public B(){
        System.out.println("New B");
    }
}
