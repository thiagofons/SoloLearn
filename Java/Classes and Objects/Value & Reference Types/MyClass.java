public class MyClass {
    public static void main(String[ ] args) {
        // Constructor
        Person j = new Person("John");  // Creates a reference to the memory location

        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
  }
    
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}

class Person {
    private String name;
    private int age;
    
    Person (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
}