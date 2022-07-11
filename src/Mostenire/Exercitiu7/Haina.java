package Mostenire.Exercitiu7;

public class Haina {

    String marca;
    int pret;

    public Haina(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Haina{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
