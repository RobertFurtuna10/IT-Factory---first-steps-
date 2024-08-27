// variabile = tipuri de date ce stocheaza valori / cutiuta in care punem valori
// variabila incepe cu litera mica si nu putem pune spatiu in numele variabilei


import java.util.Arrays;

public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Este modelul: " + modelMasina);


        // declarare
        String nume;
        String prenume;

        // initializare
        prenume = "Robert";
        nume = "Furtuna";
        int varsta = 28;

        // concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de" + varsta);
    }
}
