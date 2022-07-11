package Abstractizare.Exercitiu2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa Passenger cu proprietatea String name si metoda abstracta useBenefits();
// Creati clasele copil FirstClassPassenger, SecondClassPassenger si ThirdClassPassenger;
// Adaugati cate 3 pasageri de fiecare tip intr-o lista, si facetii-i pe toti sa utilizeze beneficiile clasei
// din care face parte (sampanie, alune, spatiu, etc.)

        ArrayList<Passenger> pasageri = new ArrayList<>();                       // Initiem o lista de pasageri si adaugam
        pasageri.add(new FirstClassPassenger("Alex Flavia"));              // cate 3 pasageri din fiecare clasa in lista
        pasageri.add(new FirstClassPassenger("Moroiu Alexandra"));
        pasageri.add(new FirstClassPassenger("Neculaie Roberta"));
        pasageri.add(new SecondClassPassenger("Palade Iulian"));
        pasageri.add(new SecondClassPassenger("Moscu Cosmin"));
        pasageri.add(new SecondClassPassenger("Cader Roxana"));
        pasageri.add(new ThirdClassPassenger("Tiriac Valentina"));
        pasageri.add(new ThirdClassPassenger("Boscu Eugen"));
        pasageri.add(new ThirdClassPassenger("Patrascu Ionel"));

        for (Passenger passenger : pasageri) {       // Pasagerii utilizeaza beneficiile specifice clasei biletului
            passenger.useBenefits();
        }
    }
}
