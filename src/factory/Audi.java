package factory;

public class Audi extends factory.Car {
    private int countOfSeat = 4;
    public Audi() {
        setId(++numberOfCars);
        brand = factory.BrandCars.AUDI;
    }
    @Override
    public void drive() {
        System.out.println("I drive on Audi");
    }

    public int getCountOfSeat() {
        return countOfSeat;
    }

    public factory.BrandCars getBrand() {
        return brand;
    }
}
