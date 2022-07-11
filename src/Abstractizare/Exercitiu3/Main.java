package Abstractizare.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa abstracta CryptoCurrency cu proprietatea double valueInUSD si metoda abstracta changeValue();
// Creati clasele copil Bitcoin, Ethereum si XRP, care vor avea propria lor implementare a metodei changeValue();
// Bitcoin are o sansa de 60% sa creasca cu 100 de dolari, si 40% sanse sa scada cu 80 de dolari;
// Ethereum are o sansa de 50% sa creasca cu 500 de dolari, si 50% sanse sa scada cu 50 de dolari;
// XRP are o sansa de 80% sa creasca cu 10 dolari, si 20% sanse sa scada cu 30 de dolari;
// Initializati cate o moneda de fiecare tip cu valoarea initiala 1000 si faceti ca fiecare moneda sa fluctueze de 30 de ori;
// Printati la consola valoarea finala a monedelor.

        Bitcoin bitcoin = new Bitcoin(1000);        // Intializam cate o cryptomoneda din fiecare
        Ethereum ethereum = new Ethereum(1000);
        XRP xrp = new XRP(1000);

        for (int i = 0; i < 30; i++) {          // Fiecare metoda va fluctua de 30 de ori
            bitcoin.changeValue();
            ethereum.changeValue();
            xrp.changeValue();
        }
        System.out.println("Valoarea finala a Bitcoin este de " + bitcoin.valueInUSD + " USD");  // Printam valoarea finala a cryptomonedelor
        System.out.println("Valoarea finala a Ethereum este de " + ethereum.valueInUSD + " USD");
        System.out.println("Valoarea finala a XRP este de " + xrp.valueInUSD + " USD");
    }
}
