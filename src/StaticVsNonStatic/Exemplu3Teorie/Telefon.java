package StaticVsNonStatic.Exemplu3Teorie;

public class Telefon {

    static int numarTelefoaneGenerate=0;

    String marca;
    String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
        numarTelefoaneGenerate++;       // Incrementam numarul de telefoane generate
    }
}
