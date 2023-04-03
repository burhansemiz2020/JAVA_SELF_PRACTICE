package Questions_Arrays;

import java.util.Arrays;

public class Q01_Arrays_KonuAnlatimi2 {
    public static void main(String[] args) {
        int [] fiyatlar = {15,25,30,10,50};
        //tum urunlere 3 lira fiyat duzenlemesi yapin
        for (int i = 0; i < fiyatlar.length; i++) {
            fiyatlar [i] +=3;

        }
        System.out.println(Arrays.toString(fiyatlar));//[18, 28, 33, 13, 53]
    }
}
