package Polimorfism.Exercitiu3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa Plane cu proprietatea int maxPassengers si metoda fly();
// Clasa JetPlane va avea intotdeauna un maxim de 2 pasageri si va zbura cu viteza mare;
// Clasa NormalPlane va avea un numar maxim de pasageri setat prin constructor, care nu poate fi mai mic de 30;
// In momentul in care avionul va zbura o va face cu viteza normala;
// Clasa PaperPlane intotdeauna va avea 0 pasageri; In momentul in care avioanele noastre de hartie vor zbura, o vor face foarte incet;
// Inserati intr-o lista un avion de fiecare tip delcarat si faceti ca toate avioanele sa zboare.

        ArrayList<Plane> avioane = new ArrayList<>();       // Initializam o lista cu avioane diferite
        avioane.add(new JetPlane());
        avioane.add(new NormalPlane(40));
        avioane.add(new PaperPlane());

        for (Plane avion : avioane) {            // Toate avioanele isi iau zborul
            avion.fly();
        }
    }
}
