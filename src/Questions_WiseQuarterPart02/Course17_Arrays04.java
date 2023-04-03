package Questions_WiseQuarterPart02;

public class Course17_Arrays04 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var
        olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.
         */
        int[] arr={2,5,2,7,2,7,5,6,4,1,6,5,6,7,5,5,5,11};

        isThere(arr,5);
        isThere(arr,11);


    }
    public static void isThere(int[] arr, int aranacakEleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==aranacakEleman){
                sayac++;
            }

        }
        System.out.println(sayac);
    }

}
