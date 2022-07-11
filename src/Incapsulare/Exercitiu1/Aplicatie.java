package Incapsulare.Exercitiu1;

public class Aplicatie {

    public static void main(String[] args) {

// Exercitiu 1 -  Clientul cere o aplicatie cu urmatoarele functionalitati - are nevoie de useri in aplicatia lui;
// Userii trebuie sa aiba un username si password si sa respecte urmatoarele conditii:
// - username sa fie de cel putin 5 caractere;
// - parola trebuie sa contina minim 2 cifre in structura ei;
// - parola trebuie sa fie de cel putin 5 caractere;
// - userul va avea o lista de tip String numita productsInCart - singura modalitate de a accesa lista va fi prin
// metodele addProductToCart(String product), removeProductFromCart(String product) si printCart();
// Testati functionalitatile aplicatiei.

        User user = new User("dragos.roman", "passwordTest1234");        // Initializam si cream un user
        System.out.println(user);

        user.setPassword("test1234");               // Testam conditiile username-ului si password-ului
        System.out.println(user);

        user.setPassword("ts12");
        System.out.println(user);

        user.setPassword("abcdefghijklmn");
        System.out.println(user);

        user.addProductInCart("Pantaloni");         // Adaugam 3 produse in cos si vizualizam cosul userului
        user.addProductInCart("Adidasi");
        user.addProductInCart("Geaca");
        System.out.println(user.getProductsInCart());

        user.removeProductFromCart("Geaca");                // Stergem un produs din cos si vizualizam cosul
        System.out.println(user.getProductsInCart());
    }
}
