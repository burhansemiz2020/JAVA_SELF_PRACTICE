package Questions_ForLoops;

import java.util.Scanner;

public class Q09_ForLoops {
    public static void main(String[] args) {
        /*
        (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        yazdirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen  bir sayi giriniz...");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i%3==0 && i%5==0) {
                System.out.println("fizzBuzz");
            } else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }

        }
        scan.close();

    }
}
