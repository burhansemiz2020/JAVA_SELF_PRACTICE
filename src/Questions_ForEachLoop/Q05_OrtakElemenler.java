package Questions_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_OrtakElemenler {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini
        karsilastirip, ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.
         */
        int[] arr1 = {2, 3, 6, 7, 4, 7};
        int[] arr2 = {1, 3, 5, 7, 9, 3};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        List<Integer> commonElements = new ArrayList<>();
        for (int eachArr1: arr1
             ) {
            for (int eachArr2: arr2
                 ) {
                if (eachArr1==eachArr2){
                    if (!commonElements.contains(eachArr1)){
                        commonElements.add(eachArr1);
                    }
                }

            }

        }
        System.out.println(commonElements);



    }
}
