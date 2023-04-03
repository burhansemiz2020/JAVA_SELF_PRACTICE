package Questions_WiseQuarterPart02;

import java.util.Arrays;
import java.util.Scanner;

public class Course17_Arrays09 {
    public static void main(String[] args) {
        /*
        Kullanicidan array olusturmak icin pozitif tamsayilar alin
        kullanicia islemi bitirmesi icin 0 a basmasi gerektigini soyleyin,
        bir onceki class tan method kullanarak aldiginiz elementleri
        arr e ekleyin
         */
        Scanner scan=new Scanner(System.in);
        int num=1;
        int[] arr=new int[0];
        while (num != 0){
            System.out.println("Enter the number for adding the array" +
                    "\nand for end the process push 0: ");
            num=scan.nextInt();
            if (num != 0){
                arr= Course17_Arrays08.arrayElement(arr, num);
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
