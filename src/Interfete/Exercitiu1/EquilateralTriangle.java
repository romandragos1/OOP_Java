package Interfete.Exercitiu1;

public class EquilateralTriangle implements RegularPolygon {

    int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLenght() {
        return this.sideLength;
    }
}
