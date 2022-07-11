package Mostenire.Exercitiu7;

public class Adidasi extends Haina {

    boolean areSireturi;

    public Adidasi(String marca, int pret, boolean areSireturi) {
        super(marca, pret);
        this.areSireturi = areSireturi;
    }

    @Override
    public String toString() {
        return "Adidasi{" +
                "areSireturi=" + areSireturi +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
