package ClaseSiObiecte.Exercitiu8;

public class Book {

    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber) {
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        currentPageNumber = 1;
    }

    public void flipPageForward() {
        if (currentPageNumber == totalPageNumber) {
            System.out.println("Nu mai avem pagini de rasfoit");
        } else {
            currentPageNumber++;
            System.out.println("Am dat la pagina " + currentPageNumber);
        }
    }

    public void flipPageBackwards() {
        if (currentPageNumber == 1) {
            System.out.println("Suntem deja la prima pagina");
        } else {
            currentPageNumber--;
            System.out.println("Am dat la pagina " + currentPageNumber);
        }
    }

    public void printBookState() {
        System.out.println("Cartea " + name + ", scrisa de " + author + ", avand " + totalPageNumber +
                " pagini, este deschisa la pagina " + currentPageNumber);
    }
}
