package Questions_WiseQuarterPart01;

public class Cours13_MethodCreatingUsing07 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */
        primeNumber(25);
        primeNumber(31);
    }

    public static void primeNumber(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag++;
                break;
            }
        }
        if (num == 2) {
            System.out.println("num 2 is prime number");
        } else if (flag == 0) {
            System.out.println("The input num is prime: " + num);
        } else {
            System.out.println("The input num is not prime: " + num);
        }
    }
}


