package two.partThree;

public class Main {
    Body body = new Body("Sedan", "Steel");
    Engine engine = new Engine("Gasoline", "Liquid", 4,"Inline", "Spark");
    Transmission transmission = new Transmission("Front-Wheel Drive", "Automatic");
    Car car = new Car(body, engine, transmission);
}
