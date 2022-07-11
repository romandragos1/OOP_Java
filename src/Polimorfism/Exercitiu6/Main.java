package Polimorfism.Exercitiu6;

public class Main {

    public static void main(String[] args) {

// Exercitiu 6 - Creati clasa Shooter cu proprietatea int maxRange si metoda shoot();
// Sniper va mosteni Shooter, va avea un maxRange de 2000 de metri si va lovi tinta in functie de distanta maxima;
// Pistol va mosteni Shooter, va avea un maxRange de 100 de metri si va lovi tinta in functie de distanta maxima;
// AK47 va mosteni Shooter, va avea un maxRange de 500 de metri si va avea metoda multiShoot();
// In momentul in care un AK47 va trage, se for folosi mai multe gloante de odata;
// Folositi toate armele.

        Sniper sniper = new Sniper();           // Initializam fiecare tip de arma
        Pistol pistol = new Pistol();
        AK47 ak47 = new AK47();

        sniper.shoot();         // Folosim fiecare tip arma
        pistol.shoot();
        ak47.shoot();
    }
}
