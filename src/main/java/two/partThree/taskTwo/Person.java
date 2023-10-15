package two.partThree.taskTwo;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.print(fullName + " рухається.");
    }
    public void talk(){
        System.out.print(fullName + " говорить.");
    }
}
