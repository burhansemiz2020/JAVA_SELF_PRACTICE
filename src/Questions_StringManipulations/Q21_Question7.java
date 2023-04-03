package Questions_StringManipulations;

import java.util.Scanner;

public class Q21_Question7 {
    public static void main(String[] args) {
        /*
        Soru 6 : Kullanicidan alinan bir String alin, String’in
        uzunlugu cift sayi ise tam ortasina :) ekleyin,
        String’in uzunlugu tek sayi ise ortadaki harfi silin
        ve yerine :( yazdirin.
        *************
        Question 6 : Prenez une chaîne de l'utilisateur,
        si la longueur de la chaîne est paire, ajoutez :)
        au milieu, si la longueur de la chaîne est impaire,
        supprimez la lettre du milieu et remplacez-la par :(
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un mot");
        String mot= scan.next();

        if (mot.length()%2==0) {
            System.out.println(mot.substring(0,mot.length()/2) + ":)"
                     + mot.substring(mot.length()/2));
        } else if (mot.length()%2!=0) {
            System.out.println(mot.substring(0,mot.length()/2) + ":("
                    + mot.substring(mot.length()/2+1) );
        }



        }


    }

