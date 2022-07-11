package ClaseSiObiecte.Exercitiu13;

public class Monitor {

    boolean on;
    double diagonala;

    public Monitor(double diagonala) {
        this.diagonala = diagonala;
    }

    public void pressPowerButton() {
        if (on) {
            System.out.println("Am oprit monitorul");
            on = false;
        } else {
            System.out.println("Am pornit monitorul");
            on = true;
        }
    }
}
