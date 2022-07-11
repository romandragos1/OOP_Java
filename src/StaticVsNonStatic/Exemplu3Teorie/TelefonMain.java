package StaticVsNonStatic.Exemplu3Teorie;

public class TelefonMain {

    public static void main(String[] args) {

        Telefon telefon1 = new Telefon("Samsung", "A72");       // Initializam primul telefon
        Telefon telefon2 = new Telefon("Samsung", "A52");       // Initializam al doilea telefon
        Telefon telefon3 = new Telefon("Samsung", "S10");       // Initializam al treilea telefon

        System.out.println("Am generat " + Telefon.numarTelefoaneGenerate + " telefoane");      // Printam totalul de telefoane generate

        Telefon telefon4 = new Telefon("Iphone", "12");         // Initializam un telefon dupa ce am printat numarul total de telefoane generate
        System.out.println("Am generat " + Telefon.numarTelefoaneGenerate + " telefoane");      // Printam totalul de telefoane generate
    }
}
