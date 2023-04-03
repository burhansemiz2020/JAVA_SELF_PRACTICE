package Questions_Arrays;

public class ArraysTumSorular04 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var
         olup olmadigini ve varsa kac kere kullanildigini
         yazdiran bir method olusturun.
         */
        int[] arr1 = {2, 4, 5, 2, 6, 4, 7, 3, 5, 2, 2, 2, 2, 2};
        elemanSayisiYazdir(arr1, 2);
        elemanSayisiYazdir(arr1, 4);
        elemanSayisiYazdir(arr1, 5);
        elemanSayisiYazdir(arr1, 6);
        elemanSayisiYazdir(arr1, 3);

        System.out.println("\n============================\n");

        String[] arr2 = {"A", "H", "M", "N", "N", "B", "A", "C", "B"};
        elemanSayisiYazdir(arr2, "A");
        elemanSayisiYazdir(arr2, "H");
        elemanSayisiYazdir(arr2, "M");
        elemanSayisiYazdir(arr2, "N");
    }

    public static void elemanSayisiYazdir(int[] arr, int arananElement) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananElement) {
                flag++;
            }
        }
        System.out.println(flag);
    }

    public static void elemanSayisiYazdir(String[] arr2, String arananElement) {
        int flag = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].equals(arananElement)) {
                flag++;
            }
        }
        System.out.println(flag);

    }
}
