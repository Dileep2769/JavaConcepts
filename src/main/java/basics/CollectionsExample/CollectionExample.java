import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Charlie");

        names.remove("Bob");
// Iterating through the list
        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(
                eachName -> System.out.println(eachName)
        );

        // Creating a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);

        for (Integer num : numbers) {
            System.out.println(num);
        }
        // Checking if a number exists in the set
//        boolean containsTwo = numbers.contains(2);
//        System.out.println("Contains 2: " + containsTwo);

        // Creating a HashMap of countries and their capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Japan", "Tokyo1");

        capitals.forEach((k, v) -> System.out.println("Key: " + k + ", value:" + v + "\n"));

        for (String eachCapital : capitals.values()) {
            System.out.println(eachCapital);
        }
        // Retrieving the capital of France
        String capitalOfFrance = capitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);

    }
}