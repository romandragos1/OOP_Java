package Polimorfism.Exercitiu2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa parinte Car si clasele copil Dacia, Ford si Hyundai;
// Fiecare masina va avea proprietatea String model, int maxSpeed si metoda reachMaxSpeed();
// Hyundai va ajunge la viteza maxima in 10 secunde;
// Ford va ajunge la viteza maxima in 15 secunde;
// Dacia va avea in plus metoda crushEngine(), va ajunge la viteza maxima in 20 secunde, iar in acel moment, motorul se va defecta
// si va afisa un mesaj corespunzator;
// Adaugati o masina de fiecare tip intr-o lista si faceti ca toate masinile sa ajunga la viteza maxima

        ArrayList<Car> masini = new ArrayList<>(Arrays.asList(              // Definim o lista de tip Car
                new Dacia("Sandero", 161),
                new Ford("Fiesta", 180),
                new Hyundai("Elantra", 200)
        ));

        for (Car masina : masini) {          // Toate masinile din lista ating viteza maxima
            masina.reachMaxSpeed();
        }
    }
}
