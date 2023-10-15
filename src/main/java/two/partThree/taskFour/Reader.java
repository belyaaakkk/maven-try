package two.partThree.taskFour;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.println(book.getTitle() + "(" + book.getAuthor() + ")");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.getTitle() + "(" + book.getAuthor() + ")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reader reader = new Reader("Бєляк Максим", 101, "Информатика", "26.01.2004", "067-194-96-63");

        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения", "Иванов И. И.");
        Book book2 = new Book("Словарь", "Петров П. П.");
        Book book3 = new Book("Энциклопедия", "Сидоров С. С.");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);
        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook(book1, book2, book3);
    }
}

