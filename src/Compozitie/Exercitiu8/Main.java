package Compozitie.Exercitiu8;

public class Main {

    public static void main(String[] args) {

// Exercitiu 8 - Creati clasa Hero cu proprietatile String name, int health si int attack;
// Creati clasa Enemy cu proprietatile String name, int health si int attack;
// Orice hero va avea in structura sa un enemy, iar un enemy va avea in structura sa un hero;
// Orice hero va avea metoda attack(), in care ataca inamicul sau - enemy-ul scazandu-i punctele corespunzatoare atacului din viata;
// Orice enemy va avea metoda attack(), in care ataca inamicul sau - hero scazandu-i punctele corespunzatoare atacului din viata;
// Generati 2 heros si 2 enemys, setati rivalitatile printr-o metoda setRival(*) specifica fiecarei clase in parte;
// Start a fight.

        Hero hero1 = new Hero("Batman", 1000, 150);     // Generam 2 eroi si 2 inamici
        Hero hero2 = new Hero("Spiderman", 1200, 250);
        Enemy enemy1 = new Enemy("Joker", 1100, 140);
        Enemy enemy2 = new Enemy("Mysterio", 1000, 135);

        hero1.setEnemy(enemy1);     // Setam relatia Hero - Enemy
        hero2.setEnemy(enemy2);
        enemy1.setEnemy(hero1);
        enemy2.setEnemy(hero2);

        hero1.attack();       // Fiecare personaj va ataca
        hero2.attack();
        enemy1.attack();
        enemy2.attack();

        System.out.println(hero1);      // Printam la consola stare fiecarui personaj
        System.out.println(hero2);
        System.out.println(enemy1);
        System.out.println(enemy2);
    }
}