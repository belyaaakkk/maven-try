package two.partThree.taskFive.com.company.vehicles;

import two.partThree.taskFive.com.company.details.Engine;
import two.partThree.taskFive.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String carModel, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(carModel, carClass, weight, driver, engine);
        System.out.println("Предельная скорость: " + maxSpeed);
    }
}
