package Compozitie.Exercitiu10;

public class Main {

    public static void main(String[] args) {

// Exercitiu 10 - Creati clasa localAttraction cu proprietatile String name, int coordonateX si int coordonateY;
// Creati clasa Town cu proprietatile String name, ArrayList<LocalAttraction> localAttractions
// si metodele addAtraction(LocalAttraction localAttraction) si displayAttractions();
// Creati 2 orase carora sa le adaugati intre 2 si 4 localAttractions;
// Printati atractiile fiecarui oras.

        Town town1 = new Town("Cluj-Napoca");       // Initializam 2 orase
        Town town2 = new Town("Constanta");

        LocalAttraction localAttraction1 = new LocalAttraction("Parcul Cetatuia",       // Initializam mai multe atractii turistice
                464629, 233450);
        LocalAttraction localAttraction2 = new LocalAttraction("Piata Unirii",
                467699, 235895);
        LocalAttraction localAttraction3 = new LocalAttraction("Cazino Faleza",
                441710, 286629);

        town1.addAttraction(localAttraction1);      // Setam atractiile locale fiecarui oras
        town1.addAttraction(localAttraction2);
        town2.addAttraction(localAttraction3);

        town1.printLocalAttractions();      // Printam la consola atractiile fiecarui oras
        System.out.println("   ");
        town2.printLocalAttractions();
    }
}