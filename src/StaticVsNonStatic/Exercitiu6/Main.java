package StaticVsNonStatic.Exercitiu6;

public class Main {

    public static void main(String[] args) {

// Exercitiu 6 - Creati clasa Employee cu proprietatile String name, int age, ArrayList<String> soldProducts si metoda sellProducts(String productName);
// Toti angajatii lucreaza la aceeasi firma care are initial e reputatie de rang 500;
// De fiecare data cand un angajat vinde un produs, acest produs va fi adaugat in lista lui de produse vandute iar reputatia companiei va creste cu 1;
// Creati 3 angajati, fiecare angajat va vinde intre 3 si 4 produse;
// Printati situatia fiecarui angajat si reputatia finala a firmei.

        Employee angajat1 = new Employee("Radu Ana", 23);          // Initializam 3 angajati
        Employee angajat2 = new Employee("Pop Mihaela", 22);
        Employee angajat3 = new Employee("Negru Alina", 21);

        angajat1.sellProducts("Fond de ten");       // Angajat 1 vinde 3 produse
        angajat1.sellProducts("Anticearcan");
        angajat1.sellProducts("Corector");

        angajat2.sellProducts("Corector");          // Angajat 2 vinde 3 produse
        angajat2.sellProducts("Crema de zi");
        angajat2.sellProducts("Crema de noapte");

        angajat3.sellProducts("Crema de corp");             // Angajat 3 vinde 4 produse
        angajat3.sellProducts("Deodorant");
        angajat3.sellProducts("Set ingrijire barbati");
        angajat3.sellProducts("Mascara");

        System.out.println(angajat1);       // Printam la consola situatia fiecarui angajat
        System.out.println(angajat2);
        System.out.println(angajat3);

        System.out.println("Rangul firmei va fi " + Employee.rang);      // Printam la consola rangul firmei
    }
}