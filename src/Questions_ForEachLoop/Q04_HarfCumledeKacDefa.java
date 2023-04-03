package Questions_ForEachLoop;

import java.util.Arrays;

public class Q04_HarfCumledeKacDefa {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede
        kullanilmissa kac kere kullanildigini yazdirin, kullanilmadiysa
        “harf cumlede kullanilmamis” yazdirin.
         */
        String cumle="yatin kalkin Java calisin";
        String harf="a";

        String [] karakterler=cumle.split("");
        System.out.println(Arrays.toString(karakterler));

        int sayac=0;
        for (String each : karakterler) {
            if (each.equalsIgnoreCase(harf))
            {
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("Istenen harf cumlede "+sayac+" adet kullanilmis");


        }


    }
}
