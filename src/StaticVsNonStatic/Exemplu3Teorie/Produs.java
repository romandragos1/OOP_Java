package StaticVsNonStatic.Exemplu3Teorie;

public class Produs {

    static int counter=1;

    int id;
    String nume;
    int pret;

    public Produs(String nume, int pret) {
        id = counter++;         // id-ul devine counter
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
