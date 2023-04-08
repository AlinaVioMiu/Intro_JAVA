public class Functii {
    // functie = o logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o f in alta f (nu pot instala firefox in chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns (nu returneaza nimic)
    // nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o f care saluta clt in functie de numele lui
    // nu ne da niciun raspuns (nu returneaza nimic)
    // are nevoie de parametri
    public static void printGreetingByname(String nume, String prenume) {
        System.out.println("buna ziua " + nume + " " + prenume);
    }

    // o f care calculeaza media a 3 numere
    // ne da un raspuns = suma nr, va avea return
    // ce tip de date va avea raspunsul? 3 + 5 = 8 => int; 3 + 6 / 2 = 4.5 => double
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o f care ne da valoarea lui pi
    // ne da un raspuns? da
    // ce tip de date va avea raspunsul? => double
    // are nevoie de parametri? nu
    public static double piValue() {
        // constanta = variabila care nu poate fi suprascrisa; se scrie cu litere de tipar
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) { // zona de apelare, desktop
        // intra clt 1
        printGreeting(); // se apeleaza functia

        // intra clt 2
        printGreeting(); // CTRL + click pe f = ne duce la corpul ei

        // apelam o functie cu parametri, oferind argumente
        printGreetingByname("Sinpetrean", "Andy");
        printGreetingByname("Sinpetrean", "Crina");
        printGreetingByname("Sinpetrean", "Ares");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(323345, 76454, 455656);
        double media2 = mediaNr(4345, 44, 455);
        double media3 = mediaNr(676, 98, 3);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());


    }
}
