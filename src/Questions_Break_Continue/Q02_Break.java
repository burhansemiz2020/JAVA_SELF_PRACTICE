package Questions_Break_Continue;

import java.util.Scanner;

public class Q02_Break {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir islem sayisi giriniz: ");
        while(true){
            int islem=scan.nextInt();
            if (islem==-1){
                System.out.println("donguden cikilyor: ");
                break;
            }
            System.out.println("islem " +islem);
            /*
            burada -1 girene kadar sout islem dongusu calismaya devam eder
            ne zaman kullanici consol a -1 girer o zaman islem break ile
            karsilasir ve islemi burada sonlandirir.
             */
        }
    }
}
