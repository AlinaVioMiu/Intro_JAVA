package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // sunt instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Andy S", "RO001");
        ContBancar cont2 = new ContBancar("Crina S", "RO002");
        // System.out.println("Titular " + cont1.titularCont);
        //System.out.println(cont1.iban);
       // System.out.println(cont1.sold);
       // System.out.println(cont1.activ);
       // System.out.println("Titular " + cont2.titularCont);

        // apelam metoda descriere
  //      cont1.descriere();
  //      cont2.descriere();

        // apelam metoda activare cont
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        cont1.interogareSold();

        // alimentam conturile cu bani
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing. cheltuim mai mult decat avem
        cont1.plataCard(500); //nu, 300.5 => pass

        // pozitive cu suma exacta
        cont1.plataCard(300.5); // da, 0 => pass

        // pozitive de 2X
        cont2.plataCard(100); // da, 900 lei
        cont2.plataCard(200); // da, 700 lei

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
