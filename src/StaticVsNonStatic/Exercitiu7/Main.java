package StaticVsNonStatic.Exercitiu7;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Creati clasa Book cu campurile String name, String authorName si metoda borrow;
// De fiecare data cand o carte este imprumutata se va contoriza si incrementa numarul total de studenti care au imprumutat vreodata carti;
// Biblioteca noastra va cuprinde 5 carti;
// Printati numarul total de studenti care au imprumutat carti de la biblioteca noastra.

        Book carte1 = new Book("Under the dome", "Stephen King");       // Initializam 5 carti
        Book carte2 = new Book("Outsider", "Stephen King");
        Book carte3 = new Book("Pet Semetery", "Stephen King");
        Book carte4 = new Book("I, Robot", "Isaac Asimov");
        Book carte5 = new Book("The Foundation", "Isaac Asimov");

        carte1.borrow();        // Cartea 1 este imprumutata de 3 ori
        carte1.borrow();
        carte1.borrow();
        carte2.borrow();        // Cartea 2 este imprumutata de 4 ori
        carte2.borrow();
        carte2.borrow();
        carte2.borrow();
        carte3.borrow();        // Cartea 3 este imprumutata o singura data
        carte4.borrow();        // Cartea 4 este imprumutata de 2 ori
        carte4.borrow();
        carte5.borrow();        // Cartea 5 este imprumutata o singura data

        System.out.println("Totalul numarului de studenti care au imprumutat " +
                "carti este de: " + Book.totalStudents);               // Printam numarul de studenti care au imprumutat carti de la biblioteca

    }
}