package ClaseSiObiecte.Exercitiu4;

public class Person {

    String nume;
    int inaltime;
    int greutate;
    int energie;

    public Person(String nume, int inaltime, int greutate) {
        this.nume = nume;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.energie = 10;
    }

    public void mananca() {
        System.out.println(nume + " a mancat");
        greutate++;
    }

    public void doarme() {
        System.out.println(nume + " doarme");
        energie++;
    }

    public void miscare() {
        System.out.println(nume + " face miscare");
        greutate--;
        energie--;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "nume='" + nume + '\'' +
                ", inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", energie=" + energie +
                '}';
    }
}
