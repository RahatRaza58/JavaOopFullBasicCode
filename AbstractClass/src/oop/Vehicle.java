package oop;

public abstract class Vehicle {
    Vehicle()
    {
        System.out.println("Vehicle class called");
    }
    void speedLimit()
    {
        System.out.println("Please Control Speed");
    }

    //abstract
    abstract void run();

}
