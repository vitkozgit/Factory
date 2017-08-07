import factory.BrandCars;
import factory.Car;
import factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static boolean rand() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < 10; ++i) {
            if(rand()) {
                cars.add(factory.create(BrandCars.AUDI));
            } else {
                cars.add(factory.create(BrandCars.FORD));
            }
        }
        System.out.println(Car.numberOfCars);
        for (Car c : cars) {
            if (c.getBrand() == BrandCars.AUDI) {
                System.out.println("Audi : " + c.getId());
            }
            if(c.getBrand() == BrandCars.FORD) {
                System.out.println("Ford : " + c.getId());
            }
        }
    }
}
