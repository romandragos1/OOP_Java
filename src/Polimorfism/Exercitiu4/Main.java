package Polimorfism.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiu 4 - Creati clasa CoffeMaker cu metoda prepareCoffe() si addCoffe(); Metoda addCoffe() va fi apelata in metoda prepareCoffe();
// Clasa CappuccinoMaker va mosteni clasa CoffeMaker si va avea metoda addMilk() si addSugar(); Cand preparam un cappuccino se va adauga cafea,
// lapte si zahar;
// Clasa EspressoMaker va mosteni clasa CoffeMaker si va avea metoda addMilk() care va intreba utilizatorul daca doreste lapte la espresso, si
// metoda makeItDuble() care va intreba utilizatorul daca doreste un espresso dublu;
// Cand preparam un espresso vom adauga cafea, vom intreba utilizatorul daca doreste o cafea dubla, iar daca da vom adauga din nou cafea.

        CappuccinoMaker cappuccinoMaker = new CappuccinoMaker();        // Initializam 2 cafele diferite
        EspressoMaker espressoMaker = new EspressoMaker();

        cappuccinoMaker.prepareCoffe();         // Preparam un capuccinno si un espresso
        System.out.println(" ");
        espressoMaker.prepareCoffe();
    }
}
