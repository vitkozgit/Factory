package factory;

public abstract class Car {
    public static int numberOfCars = 0;
    private int id = 0;
    final public static String LOGO = "The Best Autos";
    factory.BrandCars brand;

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }
    abstract public factory.BrandCars getBrand();
}
