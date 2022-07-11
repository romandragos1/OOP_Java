package Mostenire.Exercitiu7;

import java.util.ArrayList;

public class Customer {

    String nume;
    int buget;
    ArrayList<Haina> produseCumparate;

    public Customer(String nume, int buget) {
        this.nume = nume;
        this.buget = buget;
        this.produseCumparate = new ArrayList<>();
    }

    public void buyClothes(Haina haina) {
        if (this.buget >= haina.pret) {
            System.out.println("Clientul " + nume + " a cumparat" + haina);
            this.produseCumparate.add(haina);
            this.buget-=haina.pret;
        } else {
            System.out.println("Nu aveti suficienti bani pentru a cumpara " + haina);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nume='" + nume + '\'' +
                ", buget=" + buget +
                ", produseCumparate=" + produseCumparate +
                '}';
    }
}
