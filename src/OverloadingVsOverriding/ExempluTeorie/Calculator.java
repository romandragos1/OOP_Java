package OverloadingVsOverriding.ExempluTeorie;

public class Calculator {

    public void add(int a, int b) {
        System.out.println("Suma este " + (a + b));
    }

    public void add(int a, int b, int c) {                  // Aici avem conceptul de Overloading
        System.out.println("Suma este " + (a + b + c));
    }
}
