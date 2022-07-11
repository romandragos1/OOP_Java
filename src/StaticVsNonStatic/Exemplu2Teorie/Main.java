package StaticVsNonStatic.Exemplu2Teorie;

public class Main {

    public static void main(String[] args) {

        Elev elev1 = new Elev("Pandaru Marius", 14);        // Initializam primul elev
        System.out.println(elev1);                                      // Printam primul elev la consola

        Elev elev2 = new Elev("Paraschiv Adelin", 15);      // Initializam al doilea elev
        System.out.println(elev2);                                      // Printam al doilea elev la consola

        Elev.profesor = "Pandele Mariana";                              // Modificam numele profesorului
        Elev elev3 = new Elev("Podaru Ana", 14);            // Initializam al treilea elev
        System.out.println(elev3);                                      // Printam al treilea elev la consola

        System.out.println(elev1);                                      // Daca vom printa din nou elev1 va avea ultimul profesor declarat

    }
}
