public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // o functie simpla care ne printeaza ceva pe ecran, nu ne da nici un raspuns(nu are return) si nu are parametri
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit");
    }

    // o f care saluta clientul in f de numele lui
    // nu ne da nici un raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o f care calculeaza media a 3 nr
    // ne da un raspuns - suma nr. va avea return
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }
    // o f care ne da valoarea lui pi
    // ne da un raspuns? da
    // rasp va fi double
    // are nevoie de parametrii? nu
    public static double piValue() {
        final double PI = 3.14; // aceasta este o CONSTANTA (prin "final double" apelam constanta)
        return 3.14;
    }

    public static int lungimeaNumelui(String n, String p) {
        return n.length() + p.length();
    }

    // avand 3 nr, returnati pe cel mai mare
    public static int celMaiMareNumar(int d, int e, int f) {
        return Math.max(d, Math.max(e,f));
    }



    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // ctr + click pe functie => ne duce la corpul ei

        // apelam o functie cu parametri, oferind argumente
        printGreetingByName("Furtuna", "Robert");
        printGreetingByName("Furtuna", "Justin");
        printGreetingByName("Furtuna", "Andreea");

        System.out.println(mediaNr(3, 3, 7));
        double media1 = mediaNr(123, 1241, 81273);
        double media2 = mediaNr(5435, 432, 63421);
        double media3 = mediaNr(65434, 24, 2);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());


    //tema: definiti o f care returneaza cate caractere are numele + prenumele tau
        System.out.println("Lungimea numelui este de " + lungimeaNumelui("Furtuna", "Robert"));

    // avand 3 nr, returnati pe cel mai mare
        System.out.println("Cel mai mare numar este: " + celMaiMareNumar(55, 12, 22));


    }
}
