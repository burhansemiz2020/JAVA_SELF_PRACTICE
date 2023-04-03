package week01;

public class P01_printFunction {
    public static void main(String[] args) {
        //burasi yorum satiri buraya sadece tek bir yorum yazabiliyoruz
        /*
        buraya ise
        yapilan yorumlar
        satirlarca yazilabilir.
         */
        /*
            Konsola Hello World ve
            "Hello World" yazdirin
         */
        System.out.println("Hello World");
        System.out.println("\"Hello World\"");
        /*
        ("\".....\"")
         */
        System.out.println("\"Tirnak icinde gosterme\"");
        /*
        Soru2 konsola
        "Hello \
        'World' \/"
        \t 1 tab bosluk birakir
        \n bir alt satira yazar
        \" yaptigimizda metin icinde : "(tirnak) isaretini yapar
        \' bu ise tek tirnak yapar
        \\ : \ yazar
        \/ : / yazar
         */
        System.out.println("\"Hello \\\n 'World' \\/\"");
        /*
        -birinci tirnak icin once tirnak sonra slash
        -tirnak icinde Hello icin tirnak Hello
        -
         */
        System.out.println();

        System.out.println("\"Hello\t\\\n'World'\t\\/\"");
        System.out.println();

        /* deger atayarak
        Tarik Yigit - QA Software Test Engineer
         */
        String name = "Tarik";
        String surname = "Yigit";
        char a = '-';
        String job = "QA Software Test Engineer";
        //System.out.println("name:" + name + "surname:" + surname + "a:" + a + "job:" + job);
        System.out.println(name +" "+surname+"-"+job);
                System.out.println("=======KOD BASARIYLA TAMAMLANDI========");

        System.out.print(name+" ");
        System.out.print(surname+" - ");
        System.out.print(job);

        System.out.println("PRINTLN FARKI");

        System.out.println(" ");
        System.out.println(name+" ");
        System.out.println(surname+" - ");
        System.out.println(job);
        /*
          ÖDEV : Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.
          ****    WISE BANK   ****
              WISE ATM’YE HOŞGELDİNİZ
              1 – Bakiye Sorgulama
              2 – Para Yatırma
              3 – Para Çekme
              4 – Bilgi Güncelleme
              5 – Kart İade
         *****    WISE BANK   ****
         */




    }
    }

