import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
        public static void main(String[] args) {
            // Create a list of integers
            List<Integer> numbers = new ArrayList();

            // Add elements to the list
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(5);
            numbers.add(6);

            // Access elements by index
            int firstNumber = numbers.get(0);
            System.out.println("First number: " + firstNumber);

            int secondNumber = numbers.get(1);
            System.out.println("Second number: " + secondNumber);

            int thirdNumber = numbers.get(2);
            System.out.println("third number: " + thirdNumber);

            int fourthNumber = numbers.get(3);
            System.out.println("Fourth number: " + fourthNumber);

            int fifthNumber = numbers.get(4);
            System.out.println("First number: " + fifthNumber);

            // Iterate through the list
            for (int num : numbers) {
                System.out.println(num);
            }

            // Remove an element
            numbers.remove(3);
            System.out.println("After removing 2: " + numbers);

            numbers.add(4,9);
            System.out.println("After adding 9: " + numbers);
        }
}
