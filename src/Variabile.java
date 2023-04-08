public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC60";
        //string = sir de caractere
        // strongly typed = treb sa specificam tipul de date

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascriere
        modelMasina = "XC60 facelift";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;
        // initializare
        prenume = "Andy";
        nume = "Sinpetrean";
        int varsta = 34;

        // concatenare de stringuri
        System.out.println( prenume + " " + nume + " are varsta de " + varsta);

        //o variabila de tip boolean este o zona din memoria calculatorului care stocheaza date de tip adevarat sau fals


        int i;
        for (i=1; i<20; i = i+3)
            System.out.println( i );




    }
}
