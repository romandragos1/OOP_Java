package ClaseSiObiecte.Exercitiu11;

public class Main {

    public static void main(String[] args) {

// Exercitiu 11 - Create clasa User care va contine atributele (campurile): String username, String password.
// Constructorul clasei va primi urmatorii parametri: username, password si confirmPassword.
// In constructor se vor efectua urmatoarele verificari (fiecare incalcare a acestor reguli va afisa un mesaj corspunzator):
// - username trebuie sa aibe cel putin 7 caractere;
// - parola trebuie sa aibe minim 8 caractere;
// - parola trebuie sa contina cel putin 2 cifre;
// - parola pasata ca parametru trebuie sa fie aceeasi cu parola confirmata;
// Creati un user care sa respecte toate cerintele aplicatiei.
// Creati cate un user care sa incalce cate o cerinta a plicatiei.

        User user1 = new User("RomanDragos87", "pass12345", "pass12345"); // Initializam user care respecta cerintele
        User user2 = new User("Roman", "pass12345", "pass12345");         // Initializam user invalid
        User user3 = new User("RomanDragos87", "pass", "pass1");          // Initializam user invalid
        User user4 = new User("Dragos", "1", "2");                        // Initializam user invalid
    }
}