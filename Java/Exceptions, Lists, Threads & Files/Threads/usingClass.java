package Threads;

class Loader extends Thread {
    public void run(){
        System.out.println("Hello");
    }
}

public class usingClass {
    public static void main(String[] args){
        Loader obj = new Loader();
        
        obj.start();
    }
}
