package Mostenire.Exercitiu7;

public class Hanorac extends Haina {

    boolean areGluga;

    public Hanorac(String marca, int pret, boolean areGluga) {
        super(marca, pret);
        this.areGluga = areGluga;
    }

    @Override
    public String toString() {
        return "Hanorac{" +
                "areGluga=" + areGluga +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
