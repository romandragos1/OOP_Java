package StaticVsNonStatic.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Vom crea un joc video. Se va crea clasa Player, cu urmatoarele proprietati: String name si int healt;
// Jocul va suporta un numar maxim de 300 de sloturi iar fiecare player generat va ocupa 50 de sloturi;
// In momentul in care jocul nostru atinge capacitatea maxima de jucatori se va afisa un mesaj corespunzator.

        Player player1 = new Player("Dragos", 1000);        // Initializam 4 jucatori
        Player player2 = new Player("Florin", 2000);
        Player player3 = new Player("Tudor", 3000);
        Player player4 = new Player("Alex", 4000);

        Player player5 = new Player("Robert", 2000);        // Initializam inca 2 jucatori pentru a primi atentionare
        Player player6 = new Player("Marius", 3000);

        System.out.println(player1);        // Printam jucatorii la consola
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);
        System.out.println(player6);
    }
}