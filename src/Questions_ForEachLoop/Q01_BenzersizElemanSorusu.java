package Questions_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_BenzersizElemanSorusu {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane
        yapip eski array’e yeni halini atayip yazdirin.
         */

        int[] arr={4,5,6,8,7,8,9,5,2,1,6,8,5,4,6,6,2,1};
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizOlanlar=new ArrayList<>();

        for (int each: arr
             ) {
            if (!benzersizOlanlar.contains(each)){
                benzersizOlanlar.add(each);
            }

        }
        System.out.println(benzersizOlanlar);
        arr=new int[benzersizOlanlar.size()];

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i]=benzersizOlanlar.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }
}
