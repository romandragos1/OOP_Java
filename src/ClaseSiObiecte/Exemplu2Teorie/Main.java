package ClaseSiObiecte.Exemplu2Teorie;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Telefon telefonSamsung = new Telefon("Samsung", "A52", 4, 1099.90);     // Initializam mai multe telefoane
        Telefon telefonHuawei = new Telefon("Huawei", "P40", 4, 990.90);
        Telefon telefonIncomplet = new Telefon("Motorola", "Moto G22");
        Telefon telefonIncomplet2 = new Telefon("Xiaomi", "Redmi Note 7", 6);

        System.out.println(telefonSamsung);        // Printam telefoanele la consola
        System.out.println(telefonHuawei);
        System.out.println(telefonIncomplet);
        System.out.println(telefonIncomplet2);

        ArrayList<Telefon> telefoane = new ArrayList<>(Arrays.asList(telefonIncomplet, telefonIncomplet2));    // Adaugam telefoanele in lista
        telefoane.add(telefonSamsung);
        telefoane.add(telefonHuawei);

        for (Telefon telefon : telefoane) {         // Apelam metoda suna()
            telefon.suna();
        }
    }
}
