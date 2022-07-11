package Mostenire.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1 - Scrieti o superclasa Phone care sa fie mostenita de urmatoarele clase: SmartPhone, Cellular si DeskPhone;
// Scrieti in clasa Phone 2 campuri comune price si number, si metodele call() si showDetails(); Aceasta din urma sa afiseze la consola
// detalii despre telefon folosind campurile;
// Scrieti cate alte 2 clase care sa mostenesca copii clasei Phone: Samsung si Iphone mostenesc Smartphone, Nokia si Motorolla mostenesc Cellular,
// Panasonic si Cisco mostenesc DeskPhone;
// Scrieti metodele urmatoare in clasele corespunzatoare: takeScreenShot(), takePicture(), playVideo(), closeClap(), playPolytone(), sendFax()
// si mosteniti din clasele de mai sus;
// Observati ce puteti mosteni si de unde.


        // Initializam fiecare clasa si apelam metodele specifice fiecareia
        Phone phone = new Phone("0748844448", 870);
        phone.call();
        phone.showDetails();

        SmartPhone smartPhone = new SmartPhone("0744584741", 650);
        smartPhone.call();
        smartPhone.playVideo();
        smartPhone.takePicture();
        smartPhone.takeScreenShot();
        smartPhone.showDetails();

        Cellular cellular = new Cellular("0721547411", 760);
        cellular.call();
        cellular.playVideo();
        cellular.takePicture();
        cellular.showDetails();

        DeskPhone deskPhone = new DeskPhone("0264254321", 240);
        deskPhone.call();
        deskPhone.showDetails();

        Samsung samsung = new Samsung("0755652145", 1200);
        samsung.call();
        samsung.playVideo();
        samsung.takePicture();
        samsung.takeScreenShot();
        samsung.showDetails();

        Iphone iphone = new Iphone("0732452222", 2400);
        iphone.call();
        iphone.playVideo();
        iphone.takePicture();
        iphone.takeScreenShot();
        iphone.showDetails();

        Motorolla motorolla = new Motorolla("0755144521", 420, false);
        motorolla.call();
        motorolla.playVideo();
        motorolla.takePicture();
        motorolla.showDetails();
        motorolla.closeClap();
        motorolla.closeClap();
        motorolla.closeClap();

        Nokia nokia = new Nokia("0788256555", 510);
        nokia.call();
        nokia.playVideo();
        nokia.takePicture();
        nokia.showDetails();

        Panasonic panasonic = new Panasonic("0264412411", 240);
        panasonic.call();
        panasonic.playPolytone();
        panasonic.showDetails();

        Cisco cisco = new Cisco("0214558553", 610);
        cisco.call();
        cisco.sendFax();
        cisco.showDetails();
    }
}