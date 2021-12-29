class MyClass{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Yellow");

        v2.setColor("Black");

        System.out.println(v1.getColor());
        System.out.println(v2.getColor());

        v2.horn();
    }
}


public class Vehicle {
    private String color;
    
    // Class constructor
    Vehicle(){
        this.setColor("Red");
    }

    Vehicle(String c){
        this.setColor(c);
    }
    
    public void setColor(String c){
        this.color = c;
    }

    public String getColor(){
        return color;
    }

    public static void horn(){
        System.out.println("Beep!");
    }
}

