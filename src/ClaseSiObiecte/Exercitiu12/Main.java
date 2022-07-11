package ClaseSiObiecte.Exercitiu12;

public class Main {

    public static void main(String[] args) {

// Exercitiu 12 - Creati clasa FacebookUser care va contine atributele (campurile): firstName, lastName, birthYear, List<String> posts
// si functionalitatile (metodele):
// - writePost(String postContent) - va adauga o noua postare in lista lui de postari;
// - printAllPosts() - va printa toate postarile;
// Creati 2 useri. Fiecare user va scrie intre 2 - 4 postari. Printati postarile pentru fiecare user.

        FacebookUser user5 = new FacebookUser("Dragos", "Roman", 1987);        // Initializam FacebookUser Dragos Roman
        FacebookUser user6 = new FacebookUser("Florina", "Roman", 1990);       // Initializam FacebookUser Florina Roman
        user5.writePost("Aceasta va fi postarea numarul 1 a userului 1");        // Postari adaugate FacebookUser Dragos Roman
        user5.writePost("Aceasta va fi postarea numarul 2 a userului 1");
        user6.writePost("Aceasta va fi postarea numarul 1 a userului 2");        // Postari adaugate FacebookUser Florina Roman
        user6.writePost("Aceasta va fi postarea numarul 2 a userului 2");
        user6.writePost("Aceasta va fi postarea numarul 3 a userului 2");
        user5.printAllPosts();              // Printam postarile adaugate de FacebookUser Dragos Roman
        user6.printAllPosts();              // Printam postarile adaugate de FacebookUser Florina Roman
    }
}