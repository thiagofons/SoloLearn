package JavaInterfaces;

interface Animal{
    public void eat();
    public void makeSound();
}

class Cat implements Animal{
    // Sobrescrever todos os metodos da interface Animal
    public void eat(){
        System.out.println("omnomnom");
    }

    public void makeSound(){
        System.out.println("Meow");
    }
}

public class Program {
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
    }
}
