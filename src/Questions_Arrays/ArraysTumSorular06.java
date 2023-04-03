package Questions_Arrays;

public class ArraysTumSorular06 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun.
         */
        String[] arr = {"Melike", "Burkay", "inci", "Eda", "Emre"};
        enUzunEnKisaYazdir(arr);

    }
    public static void enUzunEnKisaYazdir(String [] arr){
        String enUzun=arr[0];
        String enKisa=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>enUzun.length()){
                enUzun = arr[i];
            }
            if (arr[i].length()<enKisa.length()) {
                enKisa = arr[i];
            }

        }
        System.out.println(enUzun);
        System.out.println(enKisa);
    }
}
