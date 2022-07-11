package Polimorfism.Exercitiu1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1.a - Creati o clasa Car si alte 2 clase derivate ConvertibleCar si MiniVan;
// Declarati 2 metode in clasa de baza, describeCar() si showDetails() care sa afiseze la consola un text cu detalii comune;
// Apelati metoda showDetails() in metoda describeCar();
// Implementati in clasa ConvertibleCar metoda showDetails() prin ascunderea metodei din clasa de baza si definirea alteia
// noua (suprascriere metoda showDetails());
// Implementati in clasa MiniVan metoda showDetails() prin extinderea metodei din clasa de baza si modificarea textului afisat la consola;

// Exercitiu 1.b - Scrieti o metoda statica test1() in clasa Program; In aceasta declarati 3 obiecte, cate unul de tipul fiecarei clase si apeleaza
// metoda describeCar() cu fiecare obiect. Apelati metoda test1() in metoda main si observati diferentele;
// Scrieti o metoda statica test2() in clasa Program; In aceasta declarati o lista cars, de tip Car care sa contina 3 obiecte noi de tipul fiecarei
// clase; Apeleaza metoda describeCar() prin fiecare obiect din lista folosind un loop. Apelati metoda test2() si observati diferentele;
// Scrieti o metoda test3() in clasa Program; Declarati un obiect de tip ConvertibleCar si altul de tip Minivan; Apelati metodele
// showDetails() prin fiecare; Apelati metoda test3(); Observati diferentele;
// Scrieti o metoda test4() in clasa Program; Declarati un obiect de tip ConvertibleCar si salvati-l intr-o variabila de tip Car, si altul de tip
// Minivan si salvati-l tot intr-o variabila de tip Car; Apelati metoda showDetails() prin fiecare; Apelati metoda test3(); Observati diferentele.

        test1();        // Apelam metodele test1(), test2(), test3() si test4() in metoda Main
        test2();
        test3();
        test4();
    }

    public static void test1() {
        Car car = new Car();                                        // Initializam cate un Car, ConvertibleCar si Minivan
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        car.describeCar();                    // Pentru fiecare obiect in parte apelam metoda descibeCar();
        System.out.println(" ");
        convertibleCar.describeCar();
        System.out.println(" ");
        miniVan.describeCar();

    }

    public static void test2() {
        Car car = new Car();                                        // Initializam cate un Car, ConvertibleCar si Minivan
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        ArrayList<Car> masini = new ArrayList<>(Arrays.asList(car, convertibleCar, miniVan));   // Adaugam masinile in lista de tip Car
        for (Car masina : masini) {          // Apelam metoda describeCar() printr-un 'for'
            masina.describeCar();
            System.out.println(" ");
        }
    }

    public static void test3() {
        ConvertibleCar convertibleCar = new ConvertibleCar();       // Initializam un ConvertibleCar si Minivan
        MiniVan miniVan = new MiniVan();

        convertibleCar.showDetails();           // Apelam metoda showDetails()
        System.out.println(" ");
        miniVan.showDetails();

    }

    public static void test4() {
        Car minivan = new MiniVan();                    // Initializam un Minivan si ConvertibleCar stocate in variabile de tip Car
        Car convertibleCar = new ConvertibleCar();

        minivan.showDetails();                 // Apelam metoda showDetails()
        System.out.println(" ");
        convertibleCar.showDetails();
    }
}

