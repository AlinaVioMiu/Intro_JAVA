import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date

        //string = sir de caractere delimitate de ""
        String marca = "Dacia";
        String model = "1310";
        System.out.println(marca);
        // metode ajutatoare String, cu ajutorul punctului -> .
        System.out.println(marca.toUpperCase(Locale.ROOT));
        System.out.println(marca.length());

        String a = "3";
        String b = "4";
        System.out.println(a + b); // aici = 34
        int c = 3;
        int d = 4;
        System.out.println(c + d); // aici = 7

        // integer = numar intreg, (int)
        int an_fabricatie = 1987;

        // double = numar zecimal
        double pret = 2300.50;

        // boolean = adevarat (1) sau fals (0)
        boolean inmatriculata = false;

        // char = un singur caracter: #, $
        char nota = 'A';

    }
}
