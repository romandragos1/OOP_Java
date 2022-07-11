package StaticVsNonStatic.Exercitiu5;

public class Player {

    static int slots = 0;
    String name;
    int healt;

    public Player(String name, int healt) {
        slots += 50;
        this.name = name;
        this.healt = healt;
        if (slots >= 300) {
            System.out.println("Am depasit capacitatea maxima de jucatori");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healt=" + healt +
                ", slots=" + slots +
                '}';
    }
}
