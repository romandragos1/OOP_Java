package ClaseSiObiecte.Exercitiu11;

public class User {

    String username;
    String password;

    public User(String username, String password, String confirmPassword) {

        checkUsernameLenght(username);
        checkPasswordLenght(password);
        checkPasswordDigits(password);
        checkPasswords(password, confirmPassword);
        this.username = username;
        this.password = password;
    }

    private void checkPasswords(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("Eroare: Parolele introduse nu coincid");
        }
    }

    private void checkPasswordDigits(String password) {
        char[] caractereParola = password.toCharArray();
        int numarCifre = 0;
        for (char c : caractereParola) {
            if (Character.isDigit(c)) {
                numarCifre++;
            }
        }
        if (numarCifre < 2) {
            System.out.println("Eroare: Parola trebuie sa contina minim 2 cifre");
        }
    }

    private void checkPasswordLenght(String password) {
        if (password.length() < 8) {
            System.out.println("Eroare: Parola introdusa are mai putin de 8 caractere");
        }
    }

    private void checkUsernameLenght(String username) {
        if (username.length() < 7) {
            System.out.println("Eroare: Username are mai putin de 7 caractere");
        }
    }
}
