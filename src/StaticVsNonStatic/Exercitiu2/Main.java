package StaticVsNonStatic.Exercitiu2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa Elev cu fieldurile: String name, int grade si static String school;
// Fiecare elev va avea metoda: printDetails() iar clasa elev va avea metoda changeSchoolName() care va modifica
// numele scolii in care sunt inscrisi toti elevii;
// Initializati 10 elevi si adaugati-i intr-o lista;
// Printati toti elevii, schimbati numele scolii dupa care printati-i din nou.

        Elev elev1 = new Elev("Rusu Ion", 10);              // Initializam 10 elevi
        Elev elev2 = new Elev("Paraschiv Alina", 7);
        Elev elev3 = new Elev("Bunea Ion", 9);
        Elev elev4 = new Elev("Robu David", 9);
        Elev elev5 = new Elev("Rusu Denis", 7);
        Elev elev6 = new Elev("Albert Mircea", 6);
        Elev elev7 = new Elev("Rusu Ioana", 8);
        Elev elev8 = new Elev("Nidu Rares", 10);
        Elev elev9 = new Elev("Rarinca Alexandra", 7);
        Elev elev10 = new Elev("Ruana Alex", 10);

        ArrayList<Elev> elevi = new ArrayList<>(Arrays.asList(elev1, elev2, elev3,
                elev4, elev5, elev6, elev7, elev8, elev9, elev10));          // Adaugam elevii creati intr-o lista

        Elev.changeSchoolName("Scoala Gimnaziala Nr. 224");   // Setam numele scolii prin intermediul clasei
        printList(elevi);                                              // Printam lista de elevi prin intermediul metodei printList

        Elev.changeSchoolName("Scoala Generala 'Anton Pann'");       // Modificam numele scolii
        printList(elevi);                                                     // Printam lista de elevi

    }

    public static void printList(ArrayList<Elev> elevi) {           // Definim o metoda pentru a printa toti elevii din lista
        for (Elev elev : elevi) {
            System.out.println(elev);
        }
    }
}