package Questions_JavaRepeat;

import java.util.Scanner;

public class C07_If_Elseif {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini aliniz
        kadin icin 60 yas ve uzeri
        erkek icin 65 yas uzeri emekli
        olabilirsin. Veya emekli olmak
        icin su kadar yil daha calismalisin
        yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz|n: Kadin=K veya k, Erkek=E veya e");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Yasinizi Giriniz");
        double yas= scan.nextDouble();
        
        if ((cinsiyet=='K'|| cinsiyet=='k')&& (yas>=60 && yas<=85)){
            System.out.println("Emekli olabilirsiniz");
        } else if ((cinsiyet=='K' || cinsiyet=='k') && (yas<60 && yas>=18)) {
            System.out.println(("Emekli olabilmeniz icin:\n" ) +(60-yas)+ ("\nyil calismalisiniz"));
        } else if ((cinsiyet=='E'|| cinsiyet=='e')&& (yas>=65 && yas<=85)){
            System.out.println("Emekli olabilirsiniz");
        } else if ((cinsiyet=='E' || cinsiyet=='e') && (yas<65 && yas>=18)) {
            System.out.println(("Emekli olabilmeniz icin:\n" ) +(65-yas)+ ("\nyil calismalisiniz"));
        } else if (yas>85 || yas<18){
            System.out.println("Gecersiz Yas");
        } else if (cinsiyet!='K' || cinsiyet!='k' || cinsiyet!='E' || cinsiyet!='e')
            System.out.println("Gecersiz cinsiyet");
    }
}
