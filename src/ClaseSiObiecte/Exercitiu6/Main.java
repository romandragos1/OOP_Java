package ClaseSiObiecte.Exercitiu6;

public class Main {

    public static void main(String[] args) {

// Exercitiu 6 - Creati clasa Phone care va contine atributele (campurile): brand, model, storage (int) in Gb.
// Creati 5 telefoane si printati detaliile fiecarui obiect in parte la consola, suprascrrind metoda toString.

        Phone telefon1 = new Phone("Samsung", "A52", 30);           // Initializam 5 telefoane
        Phone telefon2 = new Phone("Samsung", "A62", 30);
        Phone telefon3 = new Phone("Samsung", "A72", 30);
        Phone telefon4 = new Phone("Samsung", "A72 Plus", 60);
        Phone telefon5 = new Phone("Samsung", "A80", 80);

        System.out.println(telefon1);       // Printam detaliile telefoanelor
        System.out.println(telefon2);
        System.out.println(telefon3);
        System.out.println(telefon4);
        System.out.println(telefon5);
    }
}