import java.util.Arrays;
//Operatori:
// - aritmetici: +, -, *, /, %
// - de comparare: <, >, ==, !=, >=, <=
// logici: &&, ||, !



public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && o initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(a != b); // 5 diferit de 5? => false
        System.out.println(a == b); // 5 = 5? => true
        System.out.println(7>b && 3>b); // 7>5 SI 3>5? => false
        System.out.println(7>b || 3>b); // 7>5 SAU 3>5? => true
        System.out.println(7>b && (8>b || 3>b)); // true && true
        System.out.println(!(7>b)); // true => false

    }
}
