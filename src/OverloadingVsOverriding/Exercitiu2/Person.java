package OverloadingVsOverriding.Exercitiu2;

public class Person {

    String nume;

    public Person(String nume) {
        this.nume = nume;
    }

    public void eat(String aliment) {
        System.out.println(this.nume + " a manancat " + aliment);
    }

    public void eat(String aliment1, String aliment2) {
        System.out.println(this.nume + " a manancat " + aliment1 + " si " + aliment2);
    }

    public void eat(String aliment1, String aliment2, String aliment3) {
        System.out.println(this.nume + " a manancat " + aliment1 + " si " + aliment2 + " si " + aliment3);
    }
}
