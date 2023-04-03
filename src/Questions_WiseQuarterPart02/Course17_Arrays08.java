package Questions_WiseQuarterPart02;

import java.util.Arrays;
import java.util.Scanner;

public class Course17_Arrays08 {
    public static void main(String[] args) {
        /*
        Verilen bir array'e istenen bir elementi ekleyip;
        yeni halini bize donduren bir metot olusturun
         */
        Scanner scan=new Scanner(System.in);

        int[] arr={2,4,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number for adding: ");
        int addElement=scan.nextInt();
        arr=arrayElement(arr, addElement);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] arrayElement(int[] arr,int addElement){
        int [] newArr=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=addElement;
        return newArr;
    }
}
