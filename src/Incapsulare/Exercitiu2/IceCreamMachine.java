package Incapsulare.Exercitiu2;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamMachine {

    private ArrayList<String> arome = new ArrayList<>(Arrays.asList("ciocolata", "vanilie", "capsuni"));

    public void prepareIceCream(String desiredFlavor) {
        boolean exists = false;
        for (String aroma : arome) {
            if (desiredFlavor.equalsIgnoreCase(aroma)) {
                exists = true;
            }
        }
        if (exists) {
            System.out.println("Am preparat inghetata cu aroma de " + desiredFlavor);
        } else {
            System.out.println("Ne pare rau, dar nu avem aceasta aroma");
        }
    }

    public void addFlavor(String newFlavor) {
        arome.add(newFlavor);
    }
}
