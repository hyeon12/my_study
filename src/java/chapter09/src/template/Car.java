package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동 걸기");
    }

    public void turnOff(){
        System.out.println("시동 끄기");
    }

    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
