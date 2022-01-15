package AnonymousClasses;

public class Program {
    public static void main(String[] args){
        // Subsitui o método original pelo que foi escrito no override
        Machine m1 = new Machine(){
            @Override public void start(){
                System.out.println("Wooooo");
            }
        };
        m1.start();

        Machine m2 = new Machine();
        m2.start();
    }
}
