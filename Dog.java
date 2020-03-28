public class Dog extends Animal
{   // here we are referencing the Animal class and extending its functionality fore use with the Dog class

    // these fields are specific to the Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // this constructor holds the basic information inherited from the Animal class
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        // super means call the constructor from the class we are extending from / inheriting from
        super(name, brain, body, size, weight);
        // initializing the fields just like any class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override   // overrides the parent call eat() from the parent class
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // calling the parent method eat in Animal class
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }
}
