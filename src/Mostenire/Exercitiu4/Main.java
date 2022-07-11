package Mostenire.Exercitiu4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiul 4 - Creati clasa Student cu proprietatile String name si int grade;
// Creati clasele Premiant, StudentNormal si Corigent fiecare mostenind clasa Student;
// Premiantul va avea metoda multumeste(), studentul normal va avea metoda citeste() iar corigentul va avea metoda invata();
// Creati 3 studenti de fiecare tip si adaugati-i in liste specifice. Faceti toti studentii sa apeleze metodele lor particulare.

        ArrayList<Premiant> premianti = new ArrayList<>(Arrays.asList(          // Initializam liste de cate 3 studenti
                new Premiant("Nastase Rares", 10),
                new Premiant("Palada Mariana", 10),
                new Premiant("Stefan Violeta", 10)
        ));

        ArrayList<StudentNormal> studentNormali = new ArrayList<>(Arrays.asList(
                new StudentNormal("Popescu Loredana", 7),
                new StudentNormal("Andron Valeriu", 8),
                new StudentNormal("Moscu Eugen", 7)
        ));

        ArrayList<Corigent> corigenti = new ArrayList<>(Arrays.asList(
                new Corigent("Popescu Loredana", 4),
                new Corigent("Andron Valeriu", 4),
                new Corigent("Moscu Eugen", 3)
        ));

        for (Premiant premiant : premianti) {        // Se apeleaza metodele pentru fiecare student din fiecare lista
            premiant.multumeste();
        }

        for (StudentNormal studentNormal : studentNormali) {
            studentNormal.citeste();
        }

        for (Corigent corigent : corigenti) {
            corigent.invata();
        }
    }
}