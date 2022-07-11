package Mostenire.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Creati clasa Automobil cu proprietatile String model, boolean started si metodele startEngine() si stopEngine();
// Fiecare metoda va porni si va opri masina in functie de campul "started";
// Creati clasa Autobuz care mosteneste clasa Aumotobil. Autobuzul va avea proprietatile intMaxPassengers, int currentPassengers
// si metoda addPassenger();
// Creati clasa Tesla care mosteneste Automobil. Masina va avea proprietatea int batteryPercentage care poate fi intre 0 si 100, si
// va avea metodele drive() si charge(); Nu se poate conduce Tesla daca bateria este sub 10%;
// De fiecare data cand masina este condusa bateria va scadea cu 10%. De fiecare data cand este incarcata, bateria va ajunge la 100%.
// Creati un autobuz si o masina Tesla si apelati toate functionalitatile acestora.

        Autobuz autobuz = new Autobuz("Volvo", "9400XL", 30);       // Initializam un autobuz si o masina Tesla
        Tesla tesla = new Tesla("Tesla", "Model 3");

        for (int i = 0; i < 32; i++) {          // Incercam sa adaugam 32 de pasageri in autobuz (max30)
            autobuz.addPassenger();
        }

        autobuz.startEngine();          // Apelam metodele autobuzului
        autobuz.stopEngine();

        tesla.startEngine();            // Incercam sa facem 12 drumuri cu automobilul Tesla (max10)
        tesla.charge();
        for (int i = 0; i < 12; i++) {
            tesla.drive();
        }

        tesla.charge();         // Apelam metodele automobilului Tesla
        tesla.drive();
        tesla.stopEngine();
    }
}