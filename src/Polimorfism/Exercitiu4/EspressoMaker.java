package Polimorfism.Exercitiu4;

import java.util.Scanner;

public class EspressoMaker extends CoffeMaker {

    Scanner sc = new Scanner(System.in);

    public void addMilk() {
        System.out.println("Doriti lapte la espresso?  (* DA sau NU *)");
        String raspuns = sc.nextLine();
        if (raspuns.equalsIgnoreCase("DA")) {
            System.out.println("Am adaugat lapte la espresso");
        } else if (raspuns.equalsIgnoreCase("NU")) {
            System.out.println("Nu am adaugat lapte la espresso");
        } else {
            System.out.println("Nu ati introdus un raspuns valid");
        }
    }

    public void makeItDuble() {
        System.out.println("Doriti un espresso dublu?  (* DA sau NU *)");
        String raspuns = sc.nextLine();
        if (raspuns.equalsIgnoreCase("DA")) {
            addCoffe();
        } else if (raspuns.equalsIgnoreCase("NU")) {
            System.out.println("Am facut un espresso normal");
        } else {
            System.out.println("Nu ati introdus un raspuns valid");
        }
    }

    @Override
    public void prepareCoffe() {
        addCoffe();
        addMilk();
        makeItDuble();
    }
}
