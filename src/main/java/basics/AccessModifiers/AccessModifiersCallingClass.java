
public class AccessModifiersCallingClass {

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        System.out.println("Public variable: " + example.publicVar);
        // System.out.println("Private variable: " + example.privateVar); // Error: Cannot access privateVar
        System.out.println("Protected variable: " + example.protectedVar);
        System.out.println("Default variable: " + example.defaultVar);

        example.publicMethod();
        // example.privateMethod(); // Error: Cannot access privateMethod
        example.protectedMethod();
        example.defaultMethod();
    }
}
