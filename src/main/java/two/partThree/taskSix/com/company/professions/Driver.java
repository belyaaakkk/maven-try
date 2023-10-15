package two.partThree.taskSix.com.company.professions;

public class Driver extends Person{
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
