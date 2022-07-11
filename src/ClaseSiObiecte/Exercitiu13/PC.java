package ClaseSiObiecte.Exercitiu13;

public class PC {

    boolean on;
    int RAM;
    String procesor;

    public PC(int RAM, String procesor) {
        this.RAM = RAM;
        this.procesor = procesor;
    }

    public void pressPowerButton() {
        if (on) {
            System.out.println("Am oprit calculatorul");
            on = false;
        } else {
            System.out.println("Am pornit calculatorul");
            on = true;
        }
    }
}
