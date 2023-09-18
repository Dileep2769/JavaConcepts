public class InheritenceHari {
    public static void main(String[] args) {
        Animal2 genericAnimal = new Animal2("Generic Animal");
        Dog1 myDog = new Dog1("Buddy");

        genericAnimal.speak(); // Output: Generic Animal makes a sound
        myDog.speak();         // Output: Buddy barks
        myDog.fetch();         // Output: Buddy fetches a ball
    }
}
