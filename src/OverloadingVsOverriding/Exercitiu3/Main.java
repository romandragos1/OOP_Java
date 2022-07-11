package OverloadingVsOverriding.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasele Asigurare cu proprietatea String id si clasa ProcesatorDeAsigurari;
// Procesatorul va avea o metoda proceseazaAsigurare() care va primi ca parametru un obiect de tip asigurare si afiseaza un
// mesaj corespunzator "Am procesat asigurarea X";
// Suprascrieti metoda proceseaza() pentru a primi inca un parametru de tip boolean approvedByManager;
// Cand asigurarea este aprobata sau respinsa printati un mesaj corespunzator.

        ProcesatorDeAsigurari.proceseazaAsigurare(new Asigurare());                         // Initializam si apelam metodele
        ProcesatorDeAsigurari.proceseazaAsigurare(new Asigurare(), true);
        ProcesatorDeAsigurari.proceseazaAsigurare(new Asigurare(), false);
    }
}