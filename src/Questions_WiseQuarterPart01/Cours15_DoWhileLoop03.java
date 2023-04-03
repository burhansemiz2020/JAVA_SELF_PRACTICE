package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours15_DoWhileLoop03 {
    public static void main(String[] args) {


    /*
    Soru 3- Kullanicidan bir pozitif sayi isteyin,
    sayının tam kare olup olmadığını bulunuz,
    tamkare ise true değilse false yazdırınız.
     */
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a positive number: ");
            num = scan.nextInt();
        }
        while (num <= 0);
        boolean square = false;
        int i = 1;
        while (i * i <= num) {
            if (num % i == 0 && num / i == i) {
                square = true;
                break;
            }
            i++;
        }
        System.out.println(square);

    }
}


