package com.ok.javanew.oops.abstraction_Interfaces;


abstract class Animal {
    abstract void sound();
    abstract void colour();

    void sleep()
    {
        System.out.println("Zzzzz");
    }

}
class dog extends Animal {
    void sound ()
    {
        System.out.println("Bark");
    }
    void colour() {
        System.out.println("Green");
    }
}
class cat extends Animal {
    void sound ()
    {
        System.out.println("Meow");
    }
    void colour() {
        System.out.println("Black");
    }
}
public class Test{
    public static void main(String args[])
    {
        dog r1 = new dog();
        Animal r2 = new cat();


        r1.sound();
        r2.colour();
        r1.sleep();
    }
}