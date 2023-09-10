
public class AccessModifiersExample {
    public int publicVar = 10; // Public variable

    private int privateVar = 20; // Private variable

    protected int protectedVar = 30; // Protected variable

    int defaultVar = 40; // Default (package-private) variable

    // Public constructor
    public AccessModifiersExample() {
        System.out.println("Inside the public constructor.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }
}
