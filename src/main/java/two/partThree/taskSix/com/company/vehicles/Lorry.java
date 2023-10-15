package two.partThree.taskSix.com.company.vehicles;

import two.partThree.taskSix.com.company.details.Engine;
import two.partThree.taskSix.com.company.professions.Driver;

public class Lorry extends Car{
    private double  bodyLoadCapacity;

    public Lorry(String carModel, String carClass, int weight, Driver driver, Engine engine, int bodyLoadCapacity) {
        super(carModel, carClass, weight, driver, engine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("\nГрузоподъемность кузова: " + bodyLoadCapacity);
    }

}
