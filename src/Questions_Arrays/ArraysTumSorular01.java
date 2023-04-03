package Questions_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTumSorular01 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.
         */
        Scanner scan = new Scanner(System.in);
        //// Dizi boyutunu kullanıcıdan al
        System.out.println("Bir int array boyutu giriniz: ");
        int arrBoyut = scan.nextInt();
        int[] arr = new int[arrBoyut];
        // Dizi elemanlarını kullanıcıdan al bunun icin bir for loop olusturuyoruz,
        //Bu for loop uzerinden kullanici her girdigi degeri consol da gorebiliyor ve
        //bu degerler kullanici tarafindan girilmis oluyor.
        for (int i = 0; i < arrBoyut; i++) {
            System.out.println("Dizi elemanini giriniz: ");
            arr[i] = scan.nextInt();
        }
        // Diziyi 2 artırıp yeni halini kaydet. Burada methodu arr ye uyguluyoruz.
        arr = arrayIncreaseBy2(arr, 2);
        //Simdi ise yazdiriyoruz.
        System.out.println("Dizinin yeni hali: " + Arrays.toString(arr));

    }

    public static int[] arrayIncreaseBy2(int[] ilkArr, int artis) {
        for (int i = 0; i < ilkArr.length; i++) {
            ilkArr[i] += artis;
        }
        return ilkArr;
    }
}

