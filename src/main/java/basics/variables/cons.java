public class cons {

        String color;
        int h;
        int w;

    public void looks()
        {
            System.out.println(color);
        }


    public void height()
    {
        System.out.println("dog height " +h +" inches");
    }

    public void weight()
    {
        System.out.println("dog weight " +w +" lbs");
    }

    public void price() {

        int p = w*h;
        System.out.println("dog's cost is " + p + "rupees");
    }
}