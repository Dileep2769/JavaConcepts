


class Datatypes {

    // variables / datatypes
    int a = 5;
    short b = 6;
    byte c = 7;
    long d = 8L;
    double e = 2.56;
    float f = 5.67f;
    char g = 'g';
    boolean h = false;

    // add method
    // access modifiers(public/private/protected/default) - return type(void/datatype) - method name (we define parameters -> ex: datatype reference){ .. code .. }
    public void add(int a, int b){
        int i = 0;
        i = a + b;
        System.out.println("The addition value is =" + i);
    }

    // substract methos

    // divide method

    public static void main(String args[]){
        add(2,3);
    }

}