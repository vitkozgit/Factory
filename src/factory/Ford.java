package factory;

class Ford extends factory.Car {
    private int countOfSeat = 4;
    public Ford() {
        setId(++numberOfCars);
        brand = factory.BrandCars.FORD;
    }
    @Override
    public void drive() {
        System.out.println("I drive on Ford");
    }

    public int getCountOfSeat() {
        return countOfSeat;
    }

    public factory.BrandCars getBrand() {
        return brand;
    }
}
