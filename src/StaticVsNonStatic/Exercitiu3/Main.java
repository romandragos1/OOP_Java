package StaticVsNonStatic.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa T_Shirt cu urmatoarele proprietati: int size si String color;
// Toate tricourile vor avea aceeasi proprietate - brandName si metoda - changeBrandName(String newName);
// Schimbati numele brandului;
// Initializati inca 3 tricouri si printati detaliile tuturor tricourilor la consola.

        T_Shirt tShirt1 = new T_Shirt("Negru", "XL");           // Initializam 3 tricouri
        T_Shirt tShirt2 = new T_Shirt("Albastru", "L");
        T_Shirt tShirt3 = new T_Shirt("Alb", "M");

        System.out.println(tShirt1);        // Printam tricourile la consola
        System.out.println(tShirt2);
        System.out.println(tShirt3);

        T_Shirt.changeBrandName("Diesel");      // Schimbam numele brandului din Converse in Diesel

        T_Shirt tShirt4 = new T_Shirt("Verde", "XL");       // Adaugam alte 3 tricouri
        T_Shirt tShirt5 = new T_Shirt("Violet", "M");
        T_Shirt tShirt6 = new T_Shirt("Rosu", "XXXL");

        System.out.println(tShirt1);        // Printam toate tricourile la consola
        System.out.println(tShirt2);
        System.out.println(tShirt3);
        System.out.println(tShirt4);
        System.out.println(tShirt5);
        System.out.println(tShirt6);
    }
}