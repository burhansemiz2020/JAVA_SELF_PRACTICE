package Questions_JavaRepeat;

import java.util.Scanner;

public class C06_If_Elseif {
    public static void main(String[] args) {
        /*
        1. Demandez le poid et le taille de utilisateur
        2. Calculez l'indice de masse corporelle
            (poid*10000/(taille*taille)
        3. IMC>=30=obezite
           IMC>=25=gros
           IMC>=20=normalle
           IMC<20=maigre
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez votre poid kg");
        double poid= scan.nextDouble();
        System.out.println("Entrez votre taille cm");
        double taille= scan.nextDouble();

        double IMC=(poid*10000/(taille*taille));
        System.out.println("IMC: "+ IMC);
        if (IMC>=30 && IMC<50) System.out.println("Vous etez obese");
        else if (IMC>=25) System.out.println("Vous etes gros");
        else if (IMC>=20) System.out.println("Vous etes normalle");
        else if (IMC<20 && IMC>=2) System.out.println("Vous etes normale");
        else System.out.println("control votre values");

    }
}
