package two.partThree.taskSeven;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("мясо", "дом", "Овчарка");
        animals[1] = new Cat("рыба", "дом", "Персидская");
        animals[2] = new Horse("сено", "стойло", "Арабская");

        Vet vet = new Vet();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

    }
}
