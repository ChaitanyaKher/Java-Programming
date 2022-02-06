class Car{
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName()+" -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName()+" -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName()+" -> brake()";
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -> brake()";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -> brake()";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -> brake()";
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println();

        Ford ford = new Ford(4, "Ford Mustang GT");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println();

        Holden holden = new Holden(4,"Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
