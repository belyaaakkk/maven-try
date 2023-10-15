package two.partThree.taskOne;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "Samsung Galaxy", 150.0);
        Phone phone2 = new Phone("987-654-321", "iPhone 12");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", "555-123-456");

        phone1.sendMessage("111-222-333", "444-555-666");
    }
}
