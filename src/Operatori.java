/*
recap:
variabile
tipuri date = char, string, int, double/float, boolean

Operatori:
- aritmetici: +,-,/, *, % (modulo = restul impartirii)
- de comparare: <, >, ==, !=(diferit), <=, >=
- logici: && (si, si), || (sau, sau), ! (not = pui o intrebare si intorci rezultatul)

Flow control - if else; evaluare conditii si bifurcare a codului in functie de rezultat
 */
public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(a);
       System.out.println(a + b);
       //System.out.println(a / b);
       //System.out.println(a % b); // rezul = 0
       //System.out.println(12 % b); // rezul = 2

       //System.out.println(12 > b); // rezul = true (boolean)
        //System.out.println(a-1 > b); // rezul = false
        //System.out.println(a != b); // 5 diferit de 5; rezul = false

        System.out.println(7>b && 8>b); //7>5 si 8>5? = true
        System.out.println(7>b && 3>b); //7>5 si 3>5? = false
        System.out.println(7>b || 3>b); //7>5 SAU 3>5? = true
        System.out.println(!(7 > b)); // true => rezult = false


    }
}
