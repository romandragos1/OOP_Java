package ClaseSiObiecte.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa Person care va contine atributele (campurile): nume, varsta, sex, adresa si functionalitatile
// (metodele): merge, mananca, doarme. Creati 2 obiecte un baiat si o fata care sa acceseze aceleasi atribute si metode.
// Metodele vor afisa la consola un text corespunzator.

        Person baiat = new Person("Alex", 25, 'M', "Aleea Trandafirilor 45, Bucuresti");    // Initializam baiat
        Person fata = new Person("Ana", 27, 'F', "Calea Lacului 21, Targu - Jiu");          // Initializam fata

        baiat.merge();          // Actiuni baiat
        baiat.mananca();
        baiat.doarme();
        baiat.showDetails();    // Printam detaliile baiatului

        fata.merge();           // Actiuni fata
        fata.mananca();
        fata.doarme();
        fata.showDetails();     // Printam detaliile fetei
    }
}