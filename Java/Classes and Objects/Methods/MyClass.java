class MyClass{
    public static void main(String[] args){
        Animal dog = new Animal();
        
        dog.bark();       
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}

class Animal {
    void bark(){
        System.out.println("Woof-Woof");
    }
}