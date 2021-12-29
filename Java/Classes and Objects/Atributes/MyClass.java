class MyClass{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        v1.setColor("Green");
        System.out.println(v1.getColor());

        v2.horn();
    }
}


public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void horn(){
        System.out.println("Beep!");
    }
}

