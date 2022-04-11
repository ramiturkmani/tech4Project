package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age); //45

        //reference - object
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.breed = "puppy";
        dog1.age = 2;

        System.out.println(dog1); //javaMemoryManagement.Dog@1540e19d
        System.out.println(dog2); //javaMemoryManagement.Dog@677327b6
        System.out.println(dog3); //javaMemoryManagement.Dog@14ae5a5

    }
}
