package ClaseSiObiecte.Exemplu1Teorie;

public class Main {

    public static void main(String[] args) {

        Car masina1 = new Car();        // Initializam prima masina
        masina1.nume = "Renault";
        masina1.anFabricatie = 2020;

        System.out.println("Masina mea este de marca " + masina1.nume);     // Printam la consola detaliile primei masini

        masina1.nume = "Dacia";     // Modificam modelul primei masini

        System.out.println("Masina mea este de marca " + masina1.nume);     // Printam la consola detaliile primei masini

        masina1.startEngine();      // Apelam metoda startEngine
        masina1.stopEngine();       // Apelam metoda stopEngine

        Car masina2 = new Car();       // Initializam cea de-a doua masina
        masina2.nume = "Peugeot";
        masina2.anFabricatie = 2021;

        System.out.println("Masina2 este de marca " + masina2.nume + ", an fabricatie " + masina2.anFabricatie);

        masina2.startEngine();
        masina2.stopEngine();

    }

}