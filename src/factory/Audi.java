package factory;

public class Audi extends factory.Car {
    Audi() {
        setId(++numberOfCars);
        brand = factory.BrandCars.AUDI;
    }

    public factory.BrandCars getBrand() {
        return brand;
    }
}
