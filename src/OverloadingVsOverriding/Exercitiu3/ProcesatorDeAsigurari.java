package OverloadingVsOverriding.Exercitiu3;

public class ProcesatorDeAsigurari {

    public static void proceseazaAsigurare(Asigurare asigurare) {
        System.out.println("am procesat asigurarea " + asigurare);
    }

    public static void proceseazaAsigurare(Asigurare asigurare, boolean approvedByManager) {
        System.out.println((approvedByManager ? "" : "nu ") + "am procesat asigurarea " + asigurare);
    }
}
