package Constante.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiu 4 - Creati clasa Phone cu urmatoarele proprietati: String brand, String model si metodele makeCall(String phoneNumber)
// si downloadAppFromStore(String appName);
// Creati clasele copil Samsung, Iphone si Huawei restrictionand posibilitatea de a suprascrie metoda makeCall();
// Initializati cate un obiect de fiecare tip, faceti toate telefoanele sa efectueze un apel si sa donwloadeze o aplicatie.

        Samsung samsung = new Samsung("Samsung", "A72");        // Initializam si cream cate un telefon
        Iphone iphone = new Iphone("Iphone", "13 Pro");
        Huawei huawei = new Huawei("Huawei", "P30");

        samsung.makeCall("0755854456");         // Telefoanele efectueaza un apel
        iphone.makeCall("0264254854");
        huawei.makeCall("0218548569");

        samsung.downloadAppFromStore("WhatsApp");       // Telefoanele donloadeaza cate o aplicatie din fiecare store dedicat
        iphone.downloadAppFromStore("Telegram");
        huawei.downloadAppFromStore("Snapchat");
    }
}
