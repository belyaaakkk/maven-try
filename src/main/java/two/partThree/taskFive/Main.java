package two.partThree.taskFive;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Maxim", "Belyak", "K21-1", 5);
        Student student2 = new Student("Maria", "Chuvanko", "K21-1", 4.5);
        Student aspirant1 = new Aspirant("Valeria", "Nechitaylo", "K20-2", 5, "Course work");

        System.out.println("Student1 : " + student1.getScholarship(student1.getAverageMark()));
        System.out.println("Student2 : " + student2.getScholarship(student2.getAverageMark()));
        System.out.println("Aspirant1 : " + aspirant1.getScholarship(aspirant1.getAverageMark()));
    }
}
