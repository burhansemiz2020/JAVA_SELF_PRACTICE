package Questions_WiseQuarterPart02;

import java.util.Arrays;

public class Course17_Arrays07 {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin.
         */
        int[] arr={4,5,6};
        int addElement=10;
       //System.out.println(Arrays.toString(arr));
       //arr=addElement;
       //System.out.println(Arrays.toString(arr));
        /*
        [4, 5, 6]
        [4, 5, 6, 10]
         */


        int[] newArr=new int[arr.length+1];//0 0 0 0;
        for (int i = 0; i <arr.length; i++) {
        newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=addElement;
        System.out.println(Arrays.toString(newArr));

        arr=newArr;
        System.out.println(Arrays.toString(arr));


    }
}
