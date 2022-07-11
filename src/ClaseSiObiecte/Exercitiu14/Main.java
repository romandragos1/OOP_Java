package ClaseSiObiecte.Exercitiu14;

public class Main {

    public static void main(String[] args) {

//  Exercitiu 14 - Creati clasa BUS, cu urmatoarele proprietati: String brand, int maxPassengers, int passengersNumber, intMaxSpeed,
//  si metodele addPassenger() si reachNextStation();
//  Un autobuz nu poate primi mai multi pasageri decat capacitatea sa maxima;
//  Daca un autobuz are mai mult de jumatate din capacitatea maxima de pasageri la bord, va merge la urmatoarea statie cu jumatate din viteza sa maxima;
//  Daca un autobuz are mai putin de jumatate din capacitatea maxima de pasageri la bord, va merge la urmatoarea statie cu viteza maxima;
//  a. Creati 2 autobuze in care sa adaugati pasageri;
//  b. Faceti ambele autoboze sa ajunga la urmatoarera statie in moduri diferite (max speed / half speed - in functie de numarul pasagerilor).

        BUS bus1 = new BUS("Mercedes", 20, 60);    // Initializam autobuz1 si adaugam pasageri
        for (int i = 0; i < 16; i++) {
            bus1.addPassenger();
        }

        BUS bus2 = new BUS("Volvo", 15, 50);       // Initializam autobuz2 si adaugam pasageri
        for (int i = 0; i < 3; i++) {
            bus2.addPassenger();
        }

        bus1.reachNextStation();    // Autobuzul 1 se indreapta catre urmatoarea statie
        bus2.reachNextStation();    // Autobuzul 2 se indreapta catre urmatoarea statie
    }
}