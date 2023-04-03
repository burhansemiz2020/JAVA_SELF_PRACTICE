package Questions_Arrays;

import java.util.Arrays;

public class Q01_Arrays_KonuAnlatimi {
    public static void main(String[] args) {
        String[] isimler = {"Ali", "Veli", "Ayse"};
        int[] sayilar = {3, 4, 5, 6, 6, 5, 4, 6, 4};
        char karakterler[] = {'q', 'd', '4'};

        //Array nonprimitive data turudur.
        //eger yukaridaki gibi liste seklinde olusturmazsak
        //new keyword olusuturunca uzunlugunu yazmak zorundayiz.
        //bu uzunluktan az ya da fazla eleman alamaz.
        //yukaridaki arraylerde elemanlarin sayisinca bir array olmus olur.
        String[] arr = new String[5];//bu arrayin 5 tane elementi degeri icerir

        System.out.println(isimler);//[Ljava.lang.String;@4dd8dc3bu sekilde referansini yazdirir
        System.out.println(Arrays.toString(isimler));//[Ali, Veli, Ayse] yazdirmak icin Arrays.toString kullanmak gerekir
        System.out.println(Arrays.toString(arr));//[null, null, null, null, null] deger atamadigim icin 5 tane null degerini default olarak atadi

        int[] a = new int[7];
        System.out.println(Arrays.toString(a));//default degeri olarak int ler icin [0, 0, 0, 0, 0, 0, 0] verir.
        //arraydeki elemenlere stringlere ulasiriz
        a[0] = 4;
        System.out.println(Arrays.toString(a));//[4, 0, 0, 0, 0, 0, 0]
        a[3] = 7;
        System.out.println(Arrays.toString(a));//[4, 0, 0, 7, 0, 0, 0]
        //a[7]=8;//olmayan indexe atama yapinca: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //arrayde silme yoktur. degeri degisitirilmez.
        /*
        Sayilar arrayinin 4. elementini yazdiraim

         */
        System.out.println(sayilar[4]);//6
        //isimler arrayinin 1. indexini yazdiralim
        System.out.println(isimler[1]);//Veli

        /*SONUC OLARAK
        bir array yazdirmak istersek Arrays.toString le yazdiriyoruz
        arraye ait bir elementi yazdirirken variable in ismi ve elementin index sayisini [] icinde yazariz
         */
        //TUM ARRAYI YAZDIRMA
        int [] arr2={3,5,6,8,1,2};
        System.out.println(Arrays.toString(arr2));
        //ARRAYIN TUM ELEMENTLERINI ARALARINDA BIR BOSLUK OLARAK YAZDIRMA
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");

        }
        System.out.println("\n================================");







        //int sayi3[] = {5, 6, 8, 10};
        //sayi3[2] = 7;
        //sayi3[0] = 1;
        //System.out.println(Arrays.toString(sayi3));
        //System.out.println(sayi3[2]);


        String str = "Java cok guzel";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));


        String str2 = "Java cok guzel";
        String[] kelimeler2 = str.split("a");
        System.out.println(Arrays.toString(kelimeler2));

        String str3 = "Java cok guzel";
        String[] kelimeler3 = str.split("cok");
        System.out.println(Arrays.toString(kelimeler3));

        String str4 = "Java cok guzel";
        String[] kelimeler4 = str.split("");
        System.out.println(Arrays.toString(kelimeler4));

        int[] sayilar1 = {1, 2, 3};

    }

}
