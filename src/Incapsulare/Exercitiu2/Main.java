package Incapsulare.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa IceCreamMachine cu urmatoarele campuri:
// - o lista de tip String in care vom trece aromele aparatului de inghetata: ciocolata, vanilie, capsuni;
// - metoda prepareIceCream(String desiredFlavor);
// - metoda addFlavor (String newFlavor) - va adauga un nou tip de aroma in lista;
// Aparatul va putea prepara inghetata doar daca clientul introduce ca parametru o aroma valabila din structura aparatului;
// Testati functionalitatile aplicatiei.

        IceCreamMachine iceCreamMachine = new IceCreamMachine();       // Initializam un aparat de inghetata
        iceCreamMachine.prepareIceCream("ciocolata");       // Preparam mai multe inghetate
        iceCreamMachine.prepareIceCream("capsunI");
        iceCreamMachine.prepareIceCream("Kiwi");            // Nu exista aroma kiwi in lista aparatului de inghetata
        iceCreamMachine.prepareIceCream("VANILIE");

        iceCreamMachine.addFlavor("portocale");               // Testam functionalitatea metodei addFlavor()
        iceCreamMachine.prepareIceCream("PORTOCALE");
    }
}
