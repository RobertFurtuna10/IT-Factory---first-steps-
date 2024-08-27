
/*Flow control - if else
    evalueaza conditii si bifurca codul in functie de rezultat
*/

import java.util.Arrays;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // if
        System.out.println("pornim radio");
        // daca imi place piesa, dau mai tare
        boolean piesa_faina = true;
        if (piesa_faina == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        }
        System.out.println("oprim radio");

        // if else
        // daca nr este par printam acest lucru, altfel printam impar
        int numar = 6;
        if (numar % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

        //este un nr pozitiv?
        int nr = -8;
        if (nr > 0) {
            System.out.println("Nr este pozitiv");
        } else {
            System.out.println("Nr nu este pozitiv");
        }


        // if, else if, else
        // cum ne saluta robotelul in functie de ora? - luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora:");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("ora invalida");
        } else if (ora <= 11) {
            System.out.println("buna dimineata");
        } else if (ora <= 18) {
            System.out.println("buna ziua");
        } else if (ora <= 21) {
            System.out.println("buna seara");
        } else if (ora <= 24) {
            System.out.println("noapte buna");
        } else {
            System.out.println("ora invalida");
        }


        // tema - <0 viteza invalida, 0 stationeaza, <= 50 localitate, <= 90 drum judetean, autostrada
        int viteza_masina = 120;
        if (viteza_masina < 0) {
            System.out.println("viteza invalida");
        } else if (viteza_masina == 0) {
            System.out.println("stationeaza");
        } else if (viteza_masina <= 50) {
            System.out.println("localitate");
        } else if (viteza_masina <= 90) {
            System.out.println("drum judetean");
        } else {
            System.out.println("autostrada");
        }

        // flow control
        // switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 3:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }
    }
}
