package two.partThree;

public class Engine {
    private String fuel;
    private String coolingMethod;
    private int cylindersAmount;
    private String combustibleMixtureIgnition;

    public Engine(String fuel, String coolingMethod, int cylindersAmount, String combustibleMixtureIgnition) {
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public String getFuel() {
        return fuel;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }

    public String getCombustibleMixtureIgnition() {
        return combustibleMixtureIgnition;
    }
}
