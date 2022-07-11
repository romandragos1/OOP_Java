package Mostenire.Exercitiu7;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Clientul va cere urmatoarea aplicatie:
// Firma noastra va vinde haine. Toata hainele noastre vor avea in comun o marca si un pret;
// Vom vinde pantaloni care vor avea un numar specific de buzunare;
// Vom vinde hanorace care pot sa nu pot avea gluga;
// Vom vinde adidasi care pot sau nu pot avea sireturi;
// Clientii nostri vor avea un nume, un buget si o lista de haine cumparate;
// Creati aplicatia si testati cazurile.

        Adidasi adidasi = new Adidasi("Converse", 600, true);     // Initializam o serie de haine
        Hanorac hanorac = new Hanorac("Diesel", 300, false);
        Pantaloni pantaloni = new Pantaloni("Fila", 400, 4);

        Customer client = new Customer("Radu Viorel", 6000);      // Initializam un client
        client.buyClothes(adidasi);             // Clientul face cumparaturi
        client.buyClothes(hanorac);
        client.buyClothes(pantaloni);

        System.out.println(client);     // Afisam datele clientului
    }
}
