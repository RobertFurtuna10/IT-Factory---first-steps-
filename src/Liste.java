import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // listele au o dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elemente
        System.out.println(fructe.get(0));

        //cum aflam indexul unui element
        System.out.println(fructe.indexOf("portocala"));

        //este lista goala?
        System.out.println(fructe.isEmpty());

        if (!fructe.isEmpty()) {                  // aici intrebam daca NU este goala datorita semnului "!"
            System.out.println("tinem ore");
        } else {
            System.out.println("nu vom tine ore");
        }

        //scoatem un element din lista
        fructe.remove("portocala");

        //listam elementele
        System.out.println(fructe);
        //declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 20});

        System.out.println(numere);
        // declaram o lista dinamica
        String[] flowers = {"zambile", "lalele", "garoafe"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("trandafir");
        System.out.println(flowerList);

        // aflam unde se gaseste in lista "lalele"
        int garoafe_index = flowerList.indexOf("garoafe");

        // stergem ce este in acea pozitie
        flowerList.remove(garoafe_index);

        // scoatem in f de valoare
        flowerList.remove("lalele");

        System.out.println(flowerList);

    }
}
