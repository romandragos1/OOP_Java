package Mostenire.Exercitiu3;

public class Hero {

    String name;
    String hiddenIdentity;

    public Hero(String name, String hiddenIdentity) {
        this.name = name;
        this.hiddenIdentity = hiddenIdentity;
    }

    public void attack() {
        System.out.println(this.name + " ataca");
    }
}
