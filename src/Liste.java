import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // trebuie sa facem importuri cu alt + enter
        //au o dimensiune dinamica

        // adaugam elem in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele
        System.out.println(fructe.get(0));

        // cum se afla index-ul unui elem
        System.out.println(fructe.indexOf("banana"));

//        //eliminam toate elem
//        fructe.clear();

        //scoatem un elem
        fructe.remove("mar");

        //listam elementele
        System.out.println(fructe);

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        //este lista goala?
        System.out.println(fructe.isEmpty());
        if(!fructe.isEmpty()){ // daca NU este goala
            System.out.println("avem ce manca");
        }else {
            System.out.println("nu avem ce manca");
        }

            //declaram o lista imutabila si o initializam cu valori
            List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
            //numere.add(99); //nu putem adauga in plus numere
        System.out.println(numere);

            //declaram o lista dinamica
        String[] flowers = {"Ageratun", "Allium", "Poppy", "Catmint"};// aici este un array
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers)); // parcurge florile si le transforma intr-o lista
        flowerList.add("Rose");
        System.out.println(flowerList);

        // aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");// salvam informatia intr-o variabila
        // stergem ce este in acea pozitie, in functie de index
        flowerList.remove(poppy_index);
        System.out.println(flowerList);

        // stergem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(flowerList);

    }
}
