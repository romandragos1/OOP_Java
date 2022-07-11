package Compozitie.Exercitiu9;

import java.util.ArrayList;

public class Elev {

    String name;
    ArrayList<Integer> note = new ArrayList<>();

    public Elev(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
