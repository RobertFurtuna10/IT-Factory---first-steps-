import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class For {
    public static void main(String[] args) {
        // for - loop, structura repetitiva
        // de unde incepem? pana unde mergem? pasul de parcurgere
        // ex: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) {
            System.out.println("Dalmatianul cu nr" + i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 4, 9};
        for (int i = 0; i < numere.length; i++ ) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }

        // parcurgem array de culori
        String[] culori = {"alb","rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // suma nr din array
        int s = 0;
        for (int numar : numere) {
            s = s + numar;
        }
        System.out.println(s);

        // de cate ori apare 3 in [3, 2, 4, 3, 5, 3, 9]
        int[] lista_numere = {3, 2, 4, 3, 5, 3, 9, 3, 22, 3};
        int count = 0; // variabila pt a numara aparitiile lui 3
        for (int i=0; i < lista_numere.length; i++) {
            if (lista_numere[i] == 3) {
                count++;
            }

        }
        System.out.println("Nuamrul de aparitii ale lui 3 este: " + count);

        //Suma elementelor pare dintr-un array
        int[] cifre = {7, 20, 18, 13};
        int suma = 0;
        for (int cifra : cifre) {
            if (cifra % 2 == 0) { // verifica daca nr este par
                suma += cifra; // adauga nr par la suma
            }
        }
        System.out.println("Suma nr pare este: " + suma);

        // Scrie un program în Java care găsește și afișează cel mai lung cuvânt dintr-un array de șiruri de caractere.
        List<String> legume = Arrays.asList(new String[]{"castravete", "morcov", "ridiche", "cartof", "pastarnac"});
        System.out.println(legume); // printam lista
        String maxWord = "";
        for (String leguma : legume) {
            if (leguma.length() > maxWord.length()) {
                maxWord = leguma; // actualizam maxWord daca gasim un cuvant mai lung
            }
        }
        System.out.println("Cel mai lung cuvant este: " + maxWord);





    }
}
