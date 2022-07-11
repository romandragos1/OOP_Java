package OverloadingVsOverriding.ExempluTeorie;

public class Main {

    public static void main(String[] args) {

        // OVERRIDING - suprascrierea metodelor tine de polimorfismul Run-Time si este folosita atunci cand vrem ca fiecare clasa copil
        // sa se comporte in mod diferit fata de celelalte clase in cadrul aceleasi metode mostenite din clasa parinte;
        Melc melc = new Melc();
        Leopard leopard = new Leopard();

        melc.move();
        leopard.move();

        // OVERLOADING – supraincarcarea metodelor se foloseste atunci cand  avem aceeasi metoda intr-o clasa care vrem sa fie apelata
        // cu un numar diferit de parametri pentru a avea aproximativ acelasi raspuns in cadrul fiecarei metode;
        Calculator calculator = new Calculator();
        calculator.add(2, 4);
        calculator.add(2, 4, 6);
    }
}