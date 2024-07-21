package exercise;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Sonata());
        cars.add(new Avante());
        for(Car car : cars){
            car.run();
            System.out.println("=============================");
        }
    }
}
