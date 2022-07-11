package Constante.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Scrieti clasa Tshirt cu urmatoarele proprietati: String brand, String size, String colour;
// Ganditi-va ce proprietate nu ar trebui modificata si initializati un tricou modificand celelalte proprietati
// prin intermediul unor metode corespunzatoare.

        Tshirt tricou = new Tshirt("Converse", "Extra Large", "Negru");           // Initializam si cream un tricou

        tricou.size = "Large";                // Putem modifica doar marime si culoarea deoarece brandul este final
        tricou.colour = "Albastru";
    }
}
