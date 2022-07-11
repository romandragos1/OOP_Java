package StaticVsNonStatic.Exemplu3Teorie;

public class ProdusMain {

    public static void main(String[] args) {

        Produs produs1 = new Produs("Pantalon", 129);       // Initializam primul produs
        Produs produs2 = new Produs("Rochie", 199);         // Initializam al doilea produs
        Produs produs3 = new Produs("Tricou", 89);          // Initializam al treilea produs
        Produs produs4 = new Produs("Curea", 50);           // Initializam al patrulea produs

        System.out.println(produs1);        // Printam primul produs cu id incrementat
        System.out.println(produs2);        // Printam al doilea produs cu id incrementat
        System.out.println(produs3);        // Printam al treilea produs cu id incrementat
        System.out.println(produs4);        // Printam al patrulea produs cu id incrementat
    }
}
