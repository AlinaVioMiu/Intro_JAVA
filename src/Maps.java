import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map = o reprezentare de date in sistem cheie valoare
        // exemplu: Gigel are nota 10, Costel are nota 9
        // unordered concept

        // declaram un map gol
        Map<String, Integer> note_elevi = new HashMap<>();

        // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);

        note_elevi.put("Ana", 10);

        // aflu notele
        System.out.println("Ana are nota: " + note_elevi.get("Ana"));

        // suprascriere, actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        // vedem dimensiunea
        System.out.println(note_elevi.size());

        // stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());
        System.out.println(note_elevi);
        System.out.println(note_elevi.get("Gigel"));

        // declaram si initializam  un map cu valori
        // map nu este ordonat
        Map<String, Integer> luni = new HashMap<>();
        {{
            luni.put("Jan", 1);
            luni.put("Feb", 2);
            luni.put("Mar", 3);
        }};
        System.out.println(luni);


    }
}
