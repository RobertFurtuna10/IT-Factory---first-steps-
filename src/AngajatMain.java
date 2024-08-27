import oop.Angajat;

public class AngajatMain {
    public static void main(String[] args) {
        // cream un obiect de tip angajat
        Angajat Ion = new Angajat("Ion", "Creanga", 3500.00, 2, "Inginer");
        Angajat Marin = new Angajat("Marius", "Marin", 2500.00, 3, "Inginer Junior");
        Angajat Andreea = new Angajat("Bunea", "Andreea", 5500.00, 7, "HR");
        Angajat Robert = new Angajat("Furtuna", "Robert", 7000.00, 6, "Team Leader");

        // Afisam detaliile initiale si marim salariul pentru fiecare angajat
        Angajat[] angajati = {Ion, Marin, Andreea, Robert};
        for (Angajat angajat : angajati) {
            System.out.println("Before raise:");
            angajat.display();
            angajat.salariu_marit();
            System.out.println("After raise:");
            angajat.display();
            System.out.println();  // Print an empty line for better readability
        }
    }

}
