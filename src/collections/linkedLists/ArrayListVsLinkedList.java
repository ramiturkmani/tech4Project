package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers); //[10.5, 12.5, 13.3, 17.7]

        System.out.println("\n----- Looping LinkedList -----\n");
        for(Double d : numbers){
            System.out.println(d);

            for (int i = 0; i < numbers.size() ; i++) {
                System.out.println(numbers.get(i));
            }
        }

        System.out.println("\n----- Some methods of LinkedList -----\n");
        System.out.println(numbers.get(0)); // 10.5
        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 17.7

        System.out.println("\n----- Some additional methods of LinkedList -----\n");
        System.out.println(numbers.peek()); // getFirst() 10.5
        System.out.println(numbers.peekFirst()); // getFirst() 10.5
        System.out.println(numbers.peekLast()); // getLast() 17.7

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-----------------------------\n");
        System.out.println(numbers.poll()); // 10.5 -- gets first element and also removes it
        System.out.println(numbers.pollFirst()); // 12.5
        System.out.println(numbers.pollLast()); // 17.7

        System.out.println(numbers); // [13.3]

        System.out.println("\n-----------------------------\n");
        numbers.push(5.7); // adds the object to the head (zeroth index)
        numbers.push(8.9);
        System.out.println(numbers.pop()); //removes the object from the head (zeroth index) just like pollFirst()
        System.out.println(numbers);




    }
}
