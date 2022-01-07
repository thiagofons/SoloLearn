package AbstractClasses;

abstract class Animal {
    int legs = 0;
    /*
    Every Animal makes a sound, but each has a different way to do it. 
    That's why we define an abstract class Animal, and leave the implementation 
    of how they make sounds to the subclasses.   
    This is used when there is no meaningful definition for the method 
    in the superclass.
    */
    abstract void makeSound();
}
