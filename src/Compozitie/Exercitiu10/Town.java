package Compozitie.Exercitiu10;

import java.util.ArrayList;

public class Town {

    String name;
    ArrayList<LocalAttraction> localAttractions = new ArrayList<>();

    public Town(String name) {
        this.name = name;
    }

    public void addAttraction(LocalAttraction localAttraction){
        this.localAttractions.add(localAttraction);
    }

    public void printLocalAttractions(){
        for (LocalAttraction localAttraction : localAttractions){
            System.out.println(localAttraction);
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", localAttractions=" + localAttractions +
                '}';
    }
}
