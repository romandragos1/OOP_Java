package Interfete.ExempluTeorie1;

public class Athlete extends Human implements Sportive {
    @Override
    public void run() {
        System.out.println("Atletul alearga");
    }

    @Override
    public void eatHealthy() {
        System.out.println("Atletul mananca sanatos");
    }

    @Override
    public void eat() {
        eatHealthy();
    }
}
