package StaticVsNonStatic.Exercitiu7;

public class Book {

    static int totalStudents = 0;
    String name;
    String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public void borrow() {
        System.out.println("Cartea " + name + " a fost imprumutata.");
        totalStudents++;
    }
}
