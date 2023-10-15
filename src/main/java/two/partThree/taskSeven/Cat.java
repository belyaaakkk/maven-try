package two.partThree.taskSeven;

public class Cat extends Animal{
    private String breed;

    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }
}
