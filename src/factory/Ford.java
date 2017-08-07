package factory;

class Ford extends factory.Car {
    Ford() {
        setId(++numberOfCars);
        brand = factory.BrandCars.FORD;
    }

    public factory.BrandCars getBrand() {
        return brand;
    }
}
