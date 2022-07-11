package Interfete.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiu 4 - Se dau clasele Pc (String marca, int ram, boolean on), Laptop (String marca, int ram, boolean on)
// si Radio(String currentPost);
// Definiti interfetele Startable cu metoda start(), Stopable cu metoda stop() si Changeble cu metoda changePost(String newPost);
// Legati clasele de interfete si testati functionalitatile.

        Radio radio = new Radio("Magic FM");        // Initiem si cream cate un obiect din fiecare
        Pc pc = new Pc("Lenovo", 8);
        Laptop laptop = new Laptop("Samsung", 6);

        radio.start();                                  // Apelam metodele delcarate pentru fiecare obiect
        radio.changePost("Rock FM");
        radio.stop();

        pc.start();
        pc.stop();

        laptop.start();
        laptop.stop();
    }
}
