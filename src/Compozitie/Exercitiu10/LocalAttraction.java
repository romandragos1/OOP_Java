package Compozitie.Exercitiu10;

public class LocalAttraction {

    String name;
    int coordonateX;
    int coordonateY;

    public LocalAttraction(String name, int coordonateX, int coordonateY) {
        this.name = name;
        this.coordonateX = coordonateX;
        this.coordonateY = coordonateY;
    }

    @Override
    public String toString() {
        return "LocalAttractions{" +
                "name='" + name + '\'' +
                ", coordonateX=" + coordonateX +
                ", coordonateY=" + coordonateY +
                '}';
    }
}
