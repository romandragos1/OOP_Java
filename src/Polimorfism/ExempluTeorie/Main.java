package Polimorfism.ExempluTeorie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cetatean> cetateni = new ArrayList<>();       // Cream o lista de cate 2 cetateni din fiecare nationalitate
        cetateni.add(new American("James"));
        cetateni.add(new American("Charlotte"));
        cetateni.add(new Roman("Dragos"));
        cetateni.add(new Roman("Florina"));
        cetateni.add(new Francez("Philippe"));
        cetateni.add(new Francez("Juliette"));

        for (Cetatean cetatean : cetateni){       // Facem ca toti cetatenii sa salute fiecare in limba lui prin suprascriere metoda
            cetatean.saluta();
        }
    }
}
