package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Robert Furtuna", "RO0021");
        ContBancar cont2 = new ContBancar("Andreea Bunea", "RO2231");

        // apelam metoda descrie
        cont1.interogareSold();
        cont2.interogareSold();

        // activam conturile
        cont1.activareCont(1234);
        cont2.activareCont(3312);
        cont2.activareCont(4321);
        cont2.activareCont(1234);
        cont1.interogareSold();
        cont2.interogareSold();

        // alimentam contul
        cont1.alimentareCont(325.30);
        cont2.alimentareCont(700);
        cont2.alimentareCont(750);

        // negative testing (cheltuim mai mult decat avem)
        cont1.plataCard(500);

        // positive testing
        cont1.plataCard(300);

        // positive 2X
        cont2.plataCard(100);
        cont2.plataCard(500);


        cont1.interogareSold();
        cont2.interogareSold();
    }
}
