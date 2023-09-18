public class StaticPolymorphism {
    public static void main(String[] args) {
        MathUtils aMathUtils = new MathUtils();

        // add integers
        System.out.println("printing the addition of integers: " + aMathUtils.add(1, 5));

        // add doubles
        System.out.println("printing the addition of doubles: " + aMathUtils.add(1.0D, 5));

        // add Strings
        System.out.println("printing the addition of Strings: " + aMathUtils.add("1", "5"));
    }
}






