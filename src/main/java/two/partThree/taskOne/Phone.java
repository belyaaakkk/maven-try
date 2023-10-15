package two.partThree.taskOne;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("", "");
    }

    public Phone(String number, String model) {
        this(number, model, 0.0); // По умолчанию вес будет 0.0
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Отправить сообщение на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone { " +
                "number = '" + number + '\'' +
                ", model = '" + model + '\'' +
                ", weight = " + weight +
                '}';
    }
}
