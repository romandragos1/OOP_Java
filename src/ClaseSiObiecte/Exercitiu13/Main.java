package ClaseSiObiecte.Exercitiu13;

public class Main {

    public static void main(String[] args) {

//  Exercitiu 13 - Creati clasele PC si Monitor. PC-ul va avea urmatoarele caracteristici: boolean on, int RAM, String procesor, pressPowerButton();
//  Monitorul va avea urmatoarele caracteristici: boolean on, double diagonala, pressPowerButton();
//  Pentru ambele clase metoda pressPowerButton() va porni PC-ul / Monitorul daca sunt inchise, si il va inchide daca este pornit;
//  Creati un PC si un monitor, porniti-le si opriti-le.

        PC calculator = new PC(8, "i7");    // Initializam un calculator
        Monitor monitor = new Monitor(18.5);    // Initializam un un monitor
        calculator.pressPowerButton();                   // Apasam de 3 ori PowerButton la PC si Monitor
        calculator.pressPowerButton();
        calculator.pressPowerButton();
        monitor.pressPowerButton();
        monitor.pressPowerButton();
        monitor.pressPowerButton();
    }
}