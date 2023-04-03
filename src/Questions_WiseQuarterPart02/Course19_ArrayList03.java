package Questions_WiseQuarterPart02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course19_ArrayList03 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen
        harf iceren elementleri silip, kalan
        kismini list olarak bize donduren bir method olusturun
         */
        List<String>liste=Course19_ArrayList02.theMethodOfNames();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the lettre unwanted:");
        String lettreUnwanted= scan.next().substring(0,1);

        List<String>propreListe=deleteTheLetter(liste,lettreUnwanted);
        System.out.println(propreListe);
    }

    public static List<String> deleteTheLetter(List<String> liste, String lettreUnwanted) {
        List<String>newListe=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            if (!liste.get(i).contains(lettreUnwanted)){
                newListe.add(liste.get(i));
            }

        }return newListe;
        /*
        Enter the names:
            ahmet
            Enter the names:
            saim
            Enter the names:
            burhan
            Enter the names:
            zeynep
            Enter the names:
            betul
            Enter the names:
            q
            Enter the lettre unwanted:
            e
            [saim, burhan]
         */


    }

}
