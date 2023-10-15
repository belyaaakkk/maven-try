package two.partThree.taskFive.com.company.vehicles;

import two.partThree.taskFive.com.company.details.Engine;
import two.partThree.taskFive.com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double  weight;
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, double  weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Марка автомобиля: " + carModel + ", класс автомобиля: " + carClass + ", вес: " + weight);
        System.out.println("Водитель: " + driver.getFullName() + ", стаж вождения: " + driver.getDrivingExperience());
        System.out.println("Мотор: " + engine.getPower() + ", производитель: " + engine.getProducer());
    }
}
