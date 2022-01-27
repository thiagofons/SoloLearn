package TheEqualsMethod;

class Animal{
    String name;

    Animal(String n){
        name = n;
    }
}

public class Program {
    public static void main(String[] args){
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");

        System.out.println(a1.equals(a2));
    }
}
