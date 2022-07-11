package Incapsulare.Exercitiu1;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private ArrayList<String> productsInCart;

    public User(String username, String password) {
        checkUser(username);
        checkPassword(password);
        productsInCart = new ArrayList<>();
    }

    public void addProductInCart(String newProduct) {
        productsInCart.add(newProduct);
    }

    public void removeProductFromCart(String product) {
        productsInCart.remove(product);
    }

    public ArrayList<String> getProductsInCart() {
        return productsInCart;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        checkUser(username);
    }

    public void setPassword(String password) {
        checkPassword(password);
    }

    private void checkUser(String username) {
        if (username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Username trebuie sa contina cel putin 5 caractere");
        }
    }

    private void checkPassword(String password) {
        boolean passwordMeetsRequirments = true;
        char[] litereParola = password.toCharArray();
        int numarCifre = 0;
        for (char c : litereParola) {
            if (Character.isDigit(c)) {
                numarCifre++;
            }
        }
        if (numarCifre < 2) {
            System.out.println("Parola trebuie sa contina cel putin 2 cifre");
            passwordMeetsRequirments = false;
        }
        if (password.length() < 5) {
            System.out.println("Parola trebuie sa contina minim 5 caractere");
            passwordMeetsRequirments = false;
        }
        if (passwordMeetsRequirments) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", productsInCart=" + productsInCart +
                '}';
    }
}