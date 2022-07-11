package Mostenire.Exercitiu6;

public class Main {

    public static void main(String[] args) {

// Exercitiu 6 - Creati clasa Staff cu proprietatile String name si int salary;
// Clasa Programator va mosteni clasa Staff si va avea metoda code();
// Clasa Cleaner ca mosteni clasa Staff si va avea metoda clean();
// Clasa TeamLeader va mosteni clasa Staff. Va avea in structura ei si o lista de programatori numita 'team' si metoda assignWork()
// care ii va face pe toti programatorii din echipa sa scrie cod;
// Clasa Manager va mosteni clasa Staff si va avea metoda raiseSalary(Staff staff, int amount) care va creste salariul angajatului
// pasat ca parametru cu valoarea ammount-ului;
// Testati toate functionalitatile programului;

        TeamLeader teamLeader = new TeamLeader("Poparu Valentina", 10000);          // Initializam TeamLeader
        teamLeader.addPeopleInTheTeam(new Programator("Casin Marius", 8500));       // TeamLeader-ul adauga programatori in lista
        teamLeader.addPeopleInTheTeam(new Programator("Luparu Eugen", 8400));
        teamLeader.addPeopleInTheTeam(new Programator("Ghica Mihaela", 8700));
        teamLeader.addPeopleInTheTeam(new Programator("Amariei Viorica", 8500));
        teamLeader.addPeopleInTheTeam(new Programator("Pasoi Livia", 8200));

        teamLeader.assignWork();        // Apelam metoda assignWork

        Cleaner cleaner = new Cleaner("Scarlat Ionel", 3100);       // Initializam un 'cleaner' si ii apelam metoda
        cleaner.clean();

        Manager manager = new Manager("Bob Cristian", 10000);       // Initializam un manager
        manager.raiseSalary(teamLeader, 1000);                          // Managerul mareste salariul TeamLeaderului si Cleaner-ului
        manager.raiseSalary(cleaner, 1000);

        System.out.println(teamLeader);         // Printam la consola toti angajatii
        System.out.println(cleaner);
        System.out.println(manager);
    }
}