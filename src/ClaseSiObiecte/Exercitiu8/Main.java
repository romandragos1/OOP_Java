package ClaseSiObiecte.Exercitiu8;

public class Main {

    public static void main(String[] args) {

// Exercitiu 8a - Creati clasa Book care va contine atributele (campurile): String name, String author, int totalPageNumber,
// int currentPageNumber si functionalitatile (metodele): flipPageForward, flipPageBackwards, printBookState.
// Metoda printBookState va printa starea cartii noastre sub forma "Cartea M, scrisa de N, avand O pagini, este deschisa la pagina P"
// Metodele flipPageForward si flipPageBackwards vor modifica starea interna a cartii noastre.
// * Unei carti nu i se poate da pagini inapoi daca pagina curenta este 1, nu i se poate da pagini inainte daca pagina curenta este ultima.
// Creati o carte si rasfoiti-o.

// Exercitiu 8b - Pe baza exercitiului anterior creati in clasa Main o metoda care primeste ca parametru o carte si ii rasfoieste toate paginile.
// Apelati metoda pentru 3 carti diferite.

        Book carte1 = new Book("Pet Sematery", "Stephen King", 845);        // Initializam 3 carti
        Book carte2 = new Book("Metro 2033", "Dmitri Gluhovski", 624);
        Book carte3 = new Book("Foundation", "Isaac Asimov", 541);

        carte1.flipPageBackwards();         // Rasfoim carte 1 inapoi 1 pagina
        carte1.flipPageForward();           // Rasfoim carte 1 inainte 5 pagini;
        carte1.flipPageForward();
        carte1.flipPageForward();
        carte1.flipPageForward();
        carte1.flipPageForward();
        carte1.printBookState();            // Verificam pagina cartii 1

        rasfoiesteCartea(carte1);           // Rasfoim toata cartea 1 in continuare pagina cu pagina
        rasfoiesteCartea(carte2);           // Rasfoim toata cartea 2 pagina cu pagina
        rasfoiesteCartea(carte3);           // Rasfoim toata cartea 3 pagina cu pagina
    }

    public static void rasfoiesteCartea(Book book) {
        for (int i = book.currentPageNumber; i < book.totalPageNumber; i++) {
            book.flipPageForward();
        }
        book.printBookState();
    }
}