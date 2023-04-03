package Questions_ArrayList;

import java.util.ArrayList;
import java.util.List;


public class Questions_ArrayList_BelirliBirIndexeSayiEkleme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);//[3, 4, 5, 2]
        //3 ile 4 arasina 7 sayisini ekleyelim
        sayilar.add(1, 7);
        System.out.println(sayilar);//[3, 7, 4, 5, 2]

        List<Integer> ekler= new ArrayList<>();
        ekler.add(6);
        ekler.add(8);

        sayilar.addAll(ekler);
        System.out.println(sayilar);//[3, 7, 4, 5, 2, 6, 8]
        //7 ve 4 arasina ekleri ekleyin
        sayilar.addAll(2, ekler);
        System.out.println(sayilar);

    }

}
