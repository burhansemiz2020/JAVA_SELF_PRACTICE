package Questions_Arrays;

import java.util.Scanner;

public class Q18_DuplicateValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcı tarafından atanan sayı dizisi oluşturuluyor
        System.out.print("Dizi boyutunu girin: ");
        int boyut = input.nextInt();

        int[] sayilar = new int[boyut];

        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 0; i < boyut; i++) {
            sayilar[i] = input.nextInt();
        }

        // Tekrar eden sayılar kontrol ediliyor
        System.out.print("Tekrar eden sayılar: ");
        for (int i = 0; i < boyut; i++) {
            for (int j = i + 1; j < boyut; j++) {
                if (sayilar[i] == sayilar[j]) {
                    System.out.print(sayilar[i] + " ");
                }
            }
        }
    }
}
