public class DynamicPolymorphism {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.makeSound("Bow Bow", "Ger Ger");
        dog.haveGravity("dog");

        Cat2 cat = new Cat2();
        cat.makeSound("Moew Moew", "Moew2 Moew2");
        cat.haveGravity("cat");

        Rat2 rat2 = new Rat2();
        rat2.makeSound("rat sound", "rat sound 2");
        rat2.haveGravity("rat");
    }
}






