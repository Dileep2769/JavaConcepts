public class ArithmeticExcepton {
    public static void main (String[]args){

    int a=9;
    int b=0;

        try {
            int c = a / b;
            System.out.println("div " + c);
        } catch (ArithmeticException e){
            System.out.println("Can't divide a number by 0");
        }
    }

}

