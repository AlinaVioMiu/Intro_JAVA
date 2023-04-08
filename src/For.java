public class For {
    public static void main(String[] args) {
        /* for = loop, structura repetitiva ce rasp la:
        de unde incepem?
        pana unde mergem
        pasul de parcurgere
         */
        // problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++){
            System.out.println("Dalmatianul cu nr " + i);
        }
        // for ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30}; // numere[0] = 3, unde 0 este indexul
        for (int i = 0; i < numere.length; i++) {//i++ ins ca parcurge fiecare elem. pt a parcurge din 2 in 2 => i=i+2
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);

        }
        // for each = parcurge toate elementele din array si ajunge direct la valoare
        for (int numar: numere){
            System.out.println("numarul este: " + numar);
        }

        // parcurgere array de culori
        String [] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // suma numerelor din array. este un mic algoritm
        int s = 0; // incepem de la 0
        for (int numar: numere){
            s = s + numar;
            System.out.println(s); // aici ne arata de fiecare data suma
        }
        System.out.println(s);// aici ne arata suma tuturor numerelor din array
    }
}
