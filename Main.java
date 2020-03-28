// Demonstrating Polymorphism
class ThisCar
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public ThisCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine()
    {
        return "ThisCar -> start engine";
    }

    public String accelerate()
    {
        return "ThisCar -> accelerate";
    }

    public String brake()
    {
        return "ThisCar -> brake";
    }
}
class Mitsubishi extends ThisCar
{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi ->  accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake";
    }
}
public class Main
{
    public static void main(String [] args)
    {
        ThisCar car = new ThisCar(6,"base car");
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        Mitsubishi mitsubishi = new Mitsubishi(8,"Mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }

}
