package alone;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("autoCar");
        AutoCar autoCar = new AutoCar();
        autoCar.run();
        autoCar.refuel();
        autoCar.load();
        autoCar.stop();

        System.out.println("Bus");
        Bus bus = new Bus();
        bus.run();
        bus.refuel();
        bus.takePassenger();
        bus.stop();
    }
}
