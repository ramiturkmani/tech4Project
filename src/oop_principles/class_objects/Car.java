package oop_principles.class_objects;

public class Car {

    //Default constructor
    public Car(){

    }

    //Declaring attributes or field of Car
    public String make;
    public String model;
    public int year;
    public String color;

    //Defining some behaviors of the Car Objects
    // WHAT CAR DOES

    public void drives(){
        System.out.println("This car drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }

    //Override toString() method that comes from Object class
    //Override is implementing another body for the parent method

    @Override // Annotation
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

}
