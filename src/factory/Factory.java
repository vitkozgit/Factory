package factory;

public class Factory {
    public static Car create(BrandCars brandCars) {
        switch (brandCars) {
            case FORD:
                return new Ford();
            case AUDI:
                return new Audi();
            default:
                return null;
        }
    }
}
