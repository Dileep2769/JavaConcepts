public class Rat2 implements Animal3, LivingBeing {

    public void Rat2(){
        System.out.println("Dog instance called");
    }

    @Override
    public void makeSound(String sound1, String sound2) {
        System.out.println(" Rat bark type:" +sound1 + " Rat bark type2:" + sound2);
    }

    @Override
    public void haveGravity(String value1) {
        System.out.println(value1 + " have some gravity 9.8 m/s" );
    }
}
