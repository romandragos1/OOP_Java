package Compozitie.Exercitiu5;

public class Human {

    String name;
    Heart heart;
    Stomach stomach;
    Brain brain;

    public Human(String name, Heart heart, Stomach stomach, Brain brain) {
        this.name = name;
        this.heart = heart;
        this.stomach = stomach;
        this.brain = brain;
    }

    public void eat() {
        if (stomach.needsFood) {
            System.out.println("Am mancat");
        } else {
            System.out.println("Nu ne este foame");
        }
    }

    public void read() {
        brain.iq++;
    }

    public void live() {
        heart.beat();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                ", stomach=" + stomach +
                ", brain=" + brain +
                '}';
    }
}
