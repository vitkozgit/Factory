package factory;

import factory.BrandCars;

public class Factory {
    public factory.Car create(BrandCars brandCars) {
        switch (brandCars) {
            case FORD:
                return new Ford();
            case AUDI:
                return new factory.Audi();
            default:
                return null;
        }
    }
}
