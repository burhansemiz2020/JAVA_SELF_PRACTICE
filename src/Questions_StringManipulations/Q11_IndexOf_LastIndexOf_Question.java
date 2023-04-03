package Questions_StringManipulations;

import java.util.Scanner;

public class Q11_IndexOf_LastIndexOf_Question {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle girin");
         /*
        Verilen bir cumlede istenen bir String icin
        asagidakilerden uygun olani yazdirin
        1. aradiginiz kelime 1 kez kullanilmis
        2. aradiginiz kelime 2 kez kullanilmis
        3. aradiginiz kelime 2 den fazla kullanilmis
        4. aradiginiz kelime cumlede hic kullanilmamis
        */
        String cumle= scan.nextLine();
        System.out.println("Bir kelime girin");
        String kelime= scan.nextLine();
        int ilkIndex = cumle.indexOf(kelime);
        int lastIndex = cumle.lastIndexOf(kelime);
        int kelimeIkinciIndeksi=cumle.indexOf(kelime, (ilkIndex+1));

        if (ilkIndex == (-1)) {
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("aradiginiz kelime 1 kez kullanilmis");

        } else if (cumle.indexOf(kelime, (kelimeIkinciIndeksi+1))==-1) {
            System.out.println("aradiginiz kelime 2 kez kullanilmis");

        }else{
            System.out.println("aradiginiz kelime 2 den fazla kullanilmis");
        }
    }
}
