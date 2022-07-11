package Mostenire.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa Hero cu proprietatile String name, String hiddenIdentity si metoda attack();
// Creati clasa copil Superman careia sa ii adaugati metoda fly();
// Creati clasa copil Batman careia sa ii adaugati metoda useGadgets();
// Creati clasa copil Speedster careia sa ii adaugati metoda speedRun();
// Clasa Speedster va avea 3 clase copil: Flash, KidFlash si TornadoTwins;
// Flash va avea metoda timeTravel(), KidFlash va avea metoda savePerson() iar TornadoTwins va avea metoda doubleRun();
// Creati o instanta a fiecarui erou si apelati toate functionalitatile acestuia.

        SuperMan superMan = new SuperMan("SuperMan", "Clark Kent");         // Initializam supereroii
        Batman batman = new Batman("BatMan", "Bruce Wayne");
        Flash flash = new Flash("Flash", "Barry Allen");
        KidFlash kidFlash = new KidFlash("KidFlash", "Wallace Rudolph");
        TornadoTwins tornadoTwins = new TornadoTwins("TornadoTwins", "Don & Dawn Allen");

        superMan.attack();      // Apelam metodele supereroilor
        superMan.fly();

        batman.attack();
        batman.useGadgets();

        flash.attack();
        flash.timeTravel();
        flash.speedRun();

        kidFlash.attack();
        kidFlash.savePerson();
        kidFlash.speedRun();
    }
}