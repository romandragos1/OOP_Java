package Abstractizare.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1a - Creati clasa InstrumentMusical care are metoda cantaMuzica();
// Creati clasele copil Chitara, Pian si Saxofon;
// Initializati un obiect de fiecare tip de instrument si faceti-l sa cante;
// Fiecare instrument trebuie sa aibe propria lui implementare a metodei cantaMuzica;

// Exercitiu 1b - Creati clasa Vanzator care are metoda InstrumentMusical vindeInstrumentMusical(String instrumentMuzicalDorit);
// Metoda noastra va intreba utilizatorul ce instrument muzical doreste iar daca acesta introduce un instrument valabil,
// ii va face un test de sunet, apoi il va returna; In cazul in care instrumentul introdus nu este valabil, se va afisa
// un mesaj corespunzator;

        Chitara chitara = new Chitara();        // Initializam cate un instrument muzical si apelam metoda cantaMuzica()
        Pian pian = new Pian();
        Saxofon saxofon = new Saxofon();

        chitara.cantaMuzica();
        pian.cantaMuzica();
        saxofon.cantaMuzica();

        Vanzator vanzator = new Vanzator();     // Initializam un vanzator care va vinde cate un instrument muzical din fiecare
        InstrumentMusical instrumentMusical1 = vanzator.vindeInstrumentMuzical("chitara");
        InstrumentMusical instrumentMusical2 = vanzator.vindeInstrumentMuzical("pian");
        InstrumentMusical instrumentMusical3 = vanzator.vindeInstrumentMuzical("saxofon");
        InstrumentMusical instrumentMusical4 = vanzator.vindeInstrumentMuzical("trompeta"); // Instrument muzical neexistent
    }
}