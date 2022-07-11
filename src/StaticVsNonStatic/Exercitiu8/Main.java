package StaticVsNonStatic.Exercitiu8;

public class Main {

    public static void main(String[] args) {

// Exercitiu 8 - Creati clasa ChromeTab care contine fieldul String currentSiteName si metoda changeCurrentSite(String newSite) care navigheaza
// browserul nostru catre un nou site;
// Clasa noastra va avea un field String history care va cuprinde toate site-urile accesate in toate taburile noastre;
// Deschideti 4 taburi de chrome, schimbati de 2-3 ori site-ul in fiecare dupa care printati la consola history-ul browserului.

        ChromeTab tab1 = new ChromeTab();       // Initializam 5 tab-uri de chrome
        ChromeTab tab2 = new ChromeTab();
        ChromeTab tab3 = new ChromeTab();
        ChromeTab tab4 = new ChromeTab();
        ChromeTab tab5 = new ChromeTab();

        tab1.changeCurrentSite("www.google.com");       // Tab-urile vor schimba site-ul curent
        tab2.changeCurrentSite("www.youtube.com");
        tab1.changeCurrentSite("www.github.com");
        tab3.changeCurrentSite("www.google.com");
        tab4.changeCurrentSite("www.facebook.com");
        tab5.changeCurrentSite("www.udemy.com");

        System.out.println("Istoric: " + ChromeTab.history);        // Printam la consola history-ul de navigare
    }
}