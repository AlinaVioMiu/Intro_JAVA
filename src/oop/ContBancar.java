package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare bazata pe obiecte

    // clasa = este un tip nou
    // este definitia unui concept
    // este reteta la paste carnonata, ADN-ul uman
    // ex: clasa car

    // un obiect = instanta unei clase
    // paste carbonara, un om
    // Ex: 10 obiecte de tip Car

    // fields = proprietati = atribute
    // sunt de fapt variabile
    // ex: culoare, marca, model, consum, pret, esteOprita

    // metodele = actiuni ce pot fi facute de obiecte
    // sunt de fapt functiile
    // ex: accelereaza(), franeaza(), deschideUsa(), vopsire()

    // proprietatile, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // refactory
    // metode = actiunile clasei
    public void interogareSold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Numar de incercari gresite " + this.incercari_activare);
        System.out.println("-------------------------------- ");
        }

    public void activareCont(int pinUtilizator) {
        // modifica activ in true doar daca pin este corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin) {
            this.activ = true;
            System.out.println("Card activat cu succes");
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++; // se incrementeaza => incercari_activare + !
        }
    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Aveti in cont suma de " + this.sold);
    }

    // debitare cont, scoatere bani
    public void plataCard(double suma_cheltuita) {
        System.out.println("Buna " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma cheltuita este <= decat sold
        if (suma_cheltuita <= this.sold) {
            // dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente ! ");
        }


    }





    // cei 4 piloni ai oop-ului:
    //mosteniri (inheritance)
    //polimorphism
    // encapsulation
    // abstractization
}
