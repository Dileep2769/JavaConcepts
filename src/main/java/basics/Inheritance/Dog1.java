class Dog1 extends Animal2 {
    public Dog1(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name + " barks");
    }

    public void fetch() {
        System.out.println(name + " fetches a ball");
    }
}
