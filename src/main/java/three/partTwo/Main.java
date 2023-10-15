package three.partTwo;

public class Main {
    public static void main(String[] args) {
        User user = UserFactory.createUser(25, "John", "Doe", "New York");

        user.printInfo();
    }
}
