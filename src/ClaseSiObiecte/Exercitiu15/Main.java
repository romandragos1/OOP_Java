package ClaseSiObiecte.Exercitiu15;

public class Main {

    public static void main(String[] args) {

//  Exercitiu 15 - Creati clasa Plane, cu campurile String brand, String model, boolean isFlying, int maxPassengers, int passengerNumber
//  si metodele addPassenger(), fly() si land();
//  Un avion isi va lua zborul daca este la sol si daca are la bord cel putin jumatate din capacitatea maxima de pasageri;
//  Un avion va ateriza doar daca zboara;
//  Creati un avion caruia sa ii apelati si sa ii testati toate functionalitatile, in fiecare caz.

        Plane plane1 = new Plane("Boeing", "737", 30);  // Initializam un avion

        plane1.land();                      // Apelam aterizarea avionului;
        plane1.fly();                       // Apelam decolarea avionului
        for (int i = 0; i < 16; i++) {      // Adaugam 16 pasageri
            plane1.addPassenger();
        }
        plane1.fly();                       // Apelam decolarea avionului
        plane1.land();                      // Apelam aterizarea avionului
    }
}