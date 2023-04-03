package Questions_WiseQuarterPart02;

import java.util.Arrays;


public class Course17_Arrays01 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini
        2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */
        int[] arr={1,2,5,6,8,9};
        System.out.println(Arrays.toString(arr));
        arr=arrayArttirma(arr,2);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrayArttirma(int[] ilkArr, int artis ){
        for (int i = 0; i < ilkArr.length; i++) {
            /*
            ilk elementten baslayip dizinin son elementine kadar gidecek
             */
            ilkArr[i]+=artis;

        }
        return ilkArr;
    }

}
