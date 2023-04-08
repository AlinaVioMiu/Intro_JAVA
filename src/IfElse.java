import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
        Flow control
        if else = evalueaza conditii si bifurca codul in functie de rezultat
         */
        System.out.println("pornim radio");
        boolean piesa_faina = false; // invat calc daca piesa e faina sau nu
        // daca piesa e frumoasa, dau mai tare
        if (piesa_faina==true){
            System.out.println("dau mai tare");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("oprim radio");

        // if else
        //daca numarul este par printam acest lucru
        //altfel printam impar
        int nr = 7;
        if (nr % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        //este numarul pozitiv?
        if (nr > 0) {
                System.out.println("pozitiv");
        } else {
            System.out.println("nu este pozitiv");
        }

        //if, else if, else
        //cum ne saluta robotelul in functie de ora?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora negativa");
//        } else if (ora <= 11) {
//            System.out.println("buna dimineata");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua");
//        } else if (ora <= 21) {
//            System.out.println(" buna seara");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna");
//        } else {
//            System.out.println("ora invalida");
//        }
        // flow control - switch = se foloseste cand stim valorile posibile

        System.out.println("Alege optiunea");
        Scanner sc = new Scanner(System.in);
        int optiune = sc.nextInt();
        switch (optiune) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("RO");
                break;
            case 2:
                System.out.println("EN");
                break;
            default:
                System.out.println("optiune invalida");
        }

    } // inchide functia main
} // inchide clasa
