package Compozitie.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1 - Creati clasa Laptop cu fieldurile id (unic pentru fiecare laptop), String brand si String model; Creati clasa Employee;
// Fiecare angajat va avea un nume, prenume si laptop;
// Generati 3 angajati, fiecare cu laptopul lui personal si printati detaliile fiecaruia la consola.

        Laptop laptop1 = new Laptop("HP", "250");                    // Initializam 3 laptopuri
        Laptop laptop2 = new Laptop("Huawei", "MateBook D14");
        Laptop laptop3 = new Laptop("Lenovo", "IdeaPad 3");

        Employee angajat1 = new Employee("Roman", "Dragos", laptop1);       // Initializam 3 angajati si le alocam fiecaruia laptop
        Employee angajat2 = new Employee("Vantu", "Maria", laptop2);
        Employee angajat3 = new Employee("Popescu", "Adelin", laptop3);

        System.out.println(angajat1);       // Listam la consola detaliile fiecarui angajat
        System.out.println(angajat2);
        System.out.println(angajat3);
    }
}