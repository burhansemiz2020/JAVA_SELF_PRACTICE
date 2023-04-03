package Questions_WiseQuarterPart02;

import java.util.Scanner;

public class Course18_MDA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[][] dizi = new int[boyut][boyut];
        toplamCiftSayilar(dizi);
        System.out.println(dizi);

    }
    public static void toplamCiftSayilar(int[][] dizi) {
        int toplam = 0;  // toplamı tutmak için bir değişken oluşturuldu

        // İki döngü kullanarak, her bir elemanı kontrol ediyoruz
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                // Eğer eleman çift ise, toplama ekliyoruz
                if (dizi[i][j] % 2 == 0) {
                    toplam += dizi[i][j];
                }
            }
        }

        // Toplamı ekrana yazdırıyoruz
        System.out.println("2 boyutlu dizi içindeki çift sayıların toplamı: " + toplam);
    }
        }



