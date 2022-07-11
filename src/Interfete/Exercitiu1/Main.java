package Interfete.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1 - Creati o aplicatie cu urmatoarele caracteristici:
// - o interfata numita RegularPolygon cu 2 metode abstracte: getNumSides() si getSideLenght();
// - o clasa EquilateralTriangle care implementeaza interfata, are getNumSides() return 3 si getSideLenght()
// care returneaza o variabila de instanta setata de constructor;
// - o clasa Square care implementeaza interfata, are getNumSides() return 4 si getSideLenght()
// care returneaza o variabila de instanta setata de constructor;
// In clasa Main creati 2 metode:
// - o metoda statica getTotalSides(), care asteapta un parametru de tip RegularPolygon si returneaza numarul
// total de laturi ale tuturor elementelor;
// - o metoda statica getPerimeter(RegularPolygon p) care returneaza perimetrul formei declarate;
// Testati functionalitatile aplicatiei.

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);   // Definim un triunghi si un patrat
        Square square = new Square(10);

        int numarLaturiTriunghi = getTotalSides(equilateralTriangle);   // Incapsulam rezultatul metodelor de mai jos in variabile
        int numarLaturiPatrat = getTotalSides(square);

        System.out.println("Triunghiul echilateral are " + numarLaturiTriunghi + " laturi"); // Printam ambele rezultate
        System.out.println("Patratul are " + numarLaturiPatrat + " laturi");

        int perimetruTriunghi = getPerimeter(equilateralTriangle);      // Calculam si printam perimetrul formelor geometrice
        int perimetruPatrat = getPerimeter(square);

        System.out.println("Perimetrul triunghiului este egal cu " + perimetruTriunghi);
        System.out.println("Perimetrul patratului este egal cu " + perimetruPatrat);
    }

    public static int getTotalSides(RegularPolygon regularPolygon) {         // Cream metoda statica getTotalSides()
        return regularPolygon.getNumSides();
    }

    public static int getPerimeter(RegularPolygon regularPolygon) {          // Cream metoda statica getPerimeter()
        return regularPolygon.getNumSides() * regularPolygon.getSideLenght();
    }
}