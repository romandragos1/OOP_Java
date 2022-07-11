package Mostenire.Exercitiu7;

public class Pantaloni extends Haina {

    int numarBuzunare;

    public Pantaloni(String marca, int pret, int numarBuzunarelor) {
        super(marca, pret);
        this.numarBuzunare = numarBuzunarelor;
    }

    @Override
    public String toString() {
        return "Pantaloni{" +
                "numarBuzunare=" + numarBuzunare +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
