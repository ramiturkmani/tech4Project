package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    // default constructor
    public Animal(){

    }
    public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        this.name = name;
        this.age = age;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Fields of an Animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true; //final means can't be reassigned
    public String name;
    public String color;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        String s = "Animal{";
        if(this.name != null) s +=   "name='" + this.name + '\'';
        if(this.color != null) s += ", color='" + this.color + '\'';
        if(this.age != 0) s +=  ", age=" + this.age;
        if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;
    }

    //Testing Animal
    public static void main(String[] args) {
        /*
        Animal animal1 = new Animal(); // animal1 = object
        animal1.hasEyes = false; // compiler error because hasEyes is final instance variable
        System.out.println(animal1.hasEyes); // called hasEyes using object name (if non-static)
        System.out.println(Animal.hasEyes); // called hasEyes using class name (if static)
         */

        Animal a1 = new Animal("cow", "black", 3, false, true, false);
//        a1.name = "cow";
//        a1.age = 3;
//        a1.color = "black";
//        a1.isHerbivore = true;
//        a1.isCarnivore = false;
//        a1.isOmnivore = false;

        System.out.println(a1);

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);

        System.out.println(a2);

//        Animal aExample = new Animal("Cat", "Black");
//        aExample.name = "Dog"; // can still reassign even if created in argument
//        System.out.println(aExample);

        Animal a3 = new Animal("Parrot", "White", 2, false, true, false);

        System.out.println(a3);

        Animal a4 = new Animal("Lion", "Beige", 4, true, false, false);

        System.out.println(a4);

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        /*
        int herbivore = 0, carnivore = 0, omnivore = 0;

        for (Animal animal : animals) {
            if (animal.isHerbivore) herbivore++;
            else if (animal.isCarnivore) carnivore++;
            else omnivore++;
        }
        */

        int herbivore = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivore = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivore = (int) animals.stream().filter(animal -> animal.isOmnivore).count();

        System.out.println("Herbivore = " + herbivore);
        System.out.println("Carnivore = " + carnivore);
        System.out.println("Omnivore = " + omnivore);
























    }
}
