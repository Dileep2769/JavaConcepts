

import java.util.LinkedList;
import java.util.List;
    public class LinkedListExample {

        public static void main(String[] args) {
            // Create a LinkedList of integers
            List<Integer> numbers = new LinkedList<>();

            // Add elements to the LinkedList
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            // Access elements by index
            int first = numbers.get(0);
            System.out.println("First number: " + first);

            // Iterate through the LinkedList
            for (int number : numbers) {
                System.out.println(number);
            }

            // Remove an element
            numbers.remove(1); // Removes the second element (2)
            System.out.println("After removing 2: " + numbers);

            numbers.add(2,7);
            System.out.println("After adding 7: " + numbers);
        }
    }

