package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;

//        System.out.println(apple1.color); // Red
//        System.out.println(apple1.taste); // Sweet
//        System.out.println(apple1.price); // 0.99

        System.out.println("Apple{" +
                "color = '" + apple1.color + "', " +
                "taste = '" + apple1.taste + "', " +
                "price = '" + apple1.price + "'}");



        Apple apple2 = new Apple();
//        System.out.println(apple2.color); // null - not assigned so prints default values
//        System.out.println(apple2.taste); // null
//        System.out.println(apple2.price); // 0.0

        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

//        System.out.println(apple2.color); // Green
//        System.out.println(apple2.taste); // Sour
//        System.out.println(apple2.price); // 1.29

//        System.out.println("Apple{" +
//                "color = '" + apple2.color + "', " +
//                "taste = '" + apple2.taste + "', " +
//                "price = '" + apple2.price + "'}");

        // toString() created in the Apple class replaces the print statement above ^
        System.out.println(apple2);



        Apple apple3 = new Apple();
        apple3.color = "Yellow";
        apple3.price = .95;
        apple3.taste = "Sweet";

        System.out.println(apple3);


        //apple1, apple2, apple3
        Apple[] myApples = {apple1, apple2, apple3};

        System.out.println(Arrays.toString(myApples));

        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);

        for (Apple apple : myAppleList) {
            System.out.println("My Apple = " + apple);
        }

        for (Apple apple : myAppleList) {
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }




    }
}
