package Mostenire.Exercitiu3;

public class Flash extends Speedster {

    public Flash(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void timeTravel() {
        System.out.println(this.name + " calatoreste in timp");
    }
}
