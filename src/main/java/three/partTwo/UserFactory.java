package three.partTwo;

public class UserFactory {
    private static int nextId = 1;

    public static User createUser(int age, String firstName, String lastName, String city) {
        int id = nextId++;
        return new User(id, age, firstName, lastName, city);
    }
}
