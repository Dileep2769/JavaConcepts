public class Dog2 implements Animal3, LivingBeing {

    public void Dog2(){
        System.out.println("Dog instance called");
    }

    public void makeSound(String sound1, String sound2) {
        System.out.println(" Dog bark type:" +sound1 + " Dog bark type2:" + sound2);
    }

    public void haveGravity(String value1) {
        System.out.println(value1 + " have some gravity 9.8 m/s" );
    }
}
