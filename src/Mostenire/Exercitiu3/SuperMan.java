package Mostenire.Exercitiu3;

public class SuperMan extends Hero {

    public SuperMan(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void fly() {
        System.out.println(this.name + " zboara");
    }
}
