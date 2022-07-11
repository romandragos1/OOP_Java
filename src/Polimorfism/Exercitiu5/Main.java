package Polimorfism.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Creati clasa Shaorma cu metodele adaugaCarne(), adaugaCartofi(), adaugaSalate() si pregatesteShaorma();
// ShaormaDulce va extinde clasa Shaorma si va avea metoda adaugaKetchupDulce(). Prepararea ei va include toate metodele existente in clasa;
// ShaormaPicanta va extinde Shaorma si va avea metodele adaugaKetchupPicant() si adaugaUsturoi(); Prepararea ei va include toate metodele
// existente in clasa;
// Preparati o Shaorma dulce si una picanta "cu de toate".

        ShaormaDulce shaormaDulce = new ShaormaDulce();         // Initializam o shaorma dulce si una picanta
        ShaormaPicanta shaormaPicanta = new ShaormaPicanta();

        shaormaDulce.pregatesteShaorma();           // Preparam o shaorma dulce si una picanta "cu de toate"
        System.out.println(" ");
        shaormaPicanta.pregatesteShaorma();
    }
}
