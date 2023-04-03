package Questions_StringManipulations;

import java.util.Scanner;

public class Q12_StartsWithEndsWith {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime alin
        // verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
        // ve bitip bitmedigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("entrez une phrase");
        String phrase= scan.nextLine();
        System.out.println("entrez un mot");
        String mot= scan.next();

        if (phrase.startsWith(mot)){
            System.out.println("Le phrase commence avec " + mot);
        } else {
            System.out.println("Le phrase ne commence pas avec " + mot);
        }
        if(phrase.endsWith(mot)){
            System.out.println("Le phrase finit avec " +mot);
        } else{
            System.out.println("Le phrase ne finit pas avec " +mot);
        }
        scan.close();
    }
}
