package oop;



public class Angajat {
    String nume;
    String prenume;
    Double salariu;
    int vechime;
    String functie;

    public Angajat(String nume, String prenume, Double salariu, int vechime, String functie) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        this.vechime = vechime;
        this.functie = functie;
    }

    public void display() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Salariu: " + salariu);
        System.out.println("Vechime: " + vechime);
        System.out.println("Functie: " + functie);
    }

    public void salariu_marit() {
        if (vechime < 5) {
            salariu += 300;
            System.out.println("Felicitari! Salariul tau a fost majorat cu 300 RON");
        } else {
            salariu += 500;
            System.out.println("Felicitari! Salariul tau a fost majorat cu 500 RON");
        }
    }
}
