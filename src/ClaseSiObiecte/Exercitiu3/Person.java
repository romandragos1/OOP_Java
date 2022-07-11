package ClaseSiObiecte.Exercitiu3;

public class Person {

    String nume;
    int varsta;
    char sex;
    String adresa;

    public Person(String nume, int varsta, char sex, String adresa) {
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public void merge() {
        System.out.println(this.nume + " merge pe strada.");
    }

    public void mananca() {
        System.out.println(this.nume + " mananca.");
    }

    public void doarme() {
        System.out.println(this.nume + " doarme.");
    }

    public void showDetails() {
        System.out.println("Salut, ma numesc " + this.nume + ", am " + this.varsta + " ani si locuiesc in " + adresa);
    }

}
