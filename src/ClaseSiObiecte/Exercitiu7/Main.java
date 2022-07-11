package ClaseSiObiecte.Exercitiu7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Creati clasa Robot care va contine atributele (campurile): name, atackPower, material si functionalitatea
// (metoda) atack, care se va folosi de campurile obiectului pentru a printa un mesaj corespunzator.
// Adaugati intr-o lista 5 roboti ale caror detalii vor fi introduse de la tastatura.
// Faceti ca toti robotii din lista voastra sa atace.

        ArrayList<Robot> roboti = new ArrayList<>();                        // Initializam robotii si ii introducem de la tastatura
        Scanner scText = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceti numele robotului:");
            String nume = scText.nextLine();
            System.out.println("Introduceti valoarea atacului:");
            int valoareAtac = scInt.nextInt();
            System.out.println("Introduceti materialul robotului:");
            String material = scText.nextLine();
            roboti.add(new Robot(nume, valoareAtac, material));
        }

        for (Robot robot : roboti) {        // Actionam robotii sa atace
            robot.atack();
        }
    }
}