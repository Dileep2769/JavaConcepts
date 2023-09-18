public class Cat2 implements Animal3, LivingBeing {

    public void Cat2(){
        System.out.println("Cat instance called");
    }

    public void makeSound(String sound1, String sound2) {
        System.out.println(" Cat bark type:" +sound1 + " Cat bark type2:" + sound2);
    }

    public void haveGravity(String value1) {
        System.out.println(value1 + " have some gravity 9.8 m/s" );
    }
}
