package ClaseSiObiecte.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Scrieti un program care sa afiseze informatiile (numele, anul inscrierii, salariul, adresa) a 3 angajati prin crearea
// unei clase numite Employee;

        Employee employee1 = new Employee("Angajat 1", 2018, 3500, "67 - Eugen Ionesco");    // Cream 3 angajati
        Employee employee2 = new Employee("Angajat 2", 2019, 3680, "35 - Tudor Panait");
        Employee employee3 = new Employee("Angajat 3", 2021, 3250, "45 - Popa Vicentiu");

        employee1.showDetails();        // Printam detaliile angajatilor
        employee2.showDetails();
        employee3.showDetails();
    }
}