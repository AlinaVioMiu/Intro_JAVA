public class While {
    public static void main(String[] args) {
        // while = loop, ciclu repetitiv
        // while = zona de cod care se repeta atat tp cat o conditie e true

        // problema: masina merge cat tp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0){
            // acceleram
            System.out.println("vruum vruum");
            // scadem benzina
            litri_benzina = litri_benzina - 1;
            //aprindem beculetul cand avem <= 3
            if (litri_benzina <= 3){
                System.out.println("se aprinde becul rosu!");
            }
        }
        System.out.println("stop! nu mai avem benzina");

    }
}
