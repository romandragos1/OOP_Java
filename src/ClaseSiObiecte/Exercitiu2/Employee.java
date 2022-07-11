package ClaseSiObiecte.Exercitiu2;

public class Employee {

    String nume;
    int anulInscrierii;
    int salariu;
    String adresa;

    public Employee(String nume, int anulInscrierii, int salariu, String adresa) {
        this.nume = nume;
        this.anulInscrierii = anulInscrierii;
        this.salariu = salariu;
        this.adresa = adresa;
    }

    public void showDetails() {
        System.out.println(nume + "\t" + anulInscrierii + "\t" + salariu + "\t" + adresa);
    }

}
