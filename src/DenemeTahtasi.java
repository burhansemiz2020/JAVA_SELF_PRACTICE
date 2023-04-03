import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DenemeTahtasi {
    public static void main(String[] args) {
        // ArrayList oluştur
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Çilek");

        // Iterator oluştur
        Iterator<String> iterator = meyveler.iterator();

        // Iterator ile dolaş
        while(iterator.hasNext()) {
            String meyve = iterator.next();
            System.out.println(meyve);
        }
    }
}
