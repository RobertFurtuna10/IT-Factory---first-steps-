package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    // OOP - Object Oriented Programming
    // obiect -> implementarea unei clase (instantierea clasei)

    // ex: clasa Car
    // 10 obiecte de tip Car
    // contine proprietati = fields = atribute - nu sunt altceva decat niste variablie (culoare, marca, model, consum, pret)

    // metode - actiuni ce pot fi facute de obiecte (adica functiile)
    // de ex: accelereaza(), franeaza(), deschideUsa()


    // proprietatile = fields = atributele
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private  int pin = 1234;
    int incercari_activare = 0;

    // constructor - are rolul de a impune date de start ca si * din formulare, required fields


    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode
    public void interogareSold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Activ " + this.activ);
        System.out.println("Sold " + this.sold);
        System.out.println("Numar de incercari gresite: " + this.incercari_activare);
        System.out.println("---------------------------");

    }

    public void activareCont(int pinUtilizator) {
        // modifica activ in true doar daca pinul este corect
        System.out.println("Buna" + " " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("PIN activat cu succes!");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++; // aici se incrementeaza (adica se numara de cate ori a fost introdus pin)
        }
    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna" + " " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Aveti in cont suma de " + this.sold);
    }

    public void plataCard(double suma_cheltuita) {
        System.out.println("Buna" + " " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        if (suma_cheltuita <= this.sold) {
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else  {
            System.out.println("Fonduri insuficiente!");
        }
    }


}
