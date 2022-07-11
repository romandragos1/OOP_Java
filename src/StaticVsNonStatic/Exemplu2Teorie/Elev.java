package StaticVsNonStatic.Exemplu2Teorie;

public class Elev {

    static String profesor = "Palade Eugen";        // Alocam un profesor elevului

    String nume;
    int varsta;

    public Elev(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Suprascriem metoda toString pentru a putea printa elevii + profesorul alocat

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", profesor=" + profesor +
                '}';
    }
}
