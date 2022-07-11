package Interfete.Exercitiu1;

import java.awt.*;

public class Square implements RegularPolygon {

    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLenght() {
        return this.sideLength;
    }
}
