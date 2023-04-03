package Questions_StringManipulations;

public class Q09_IndexOfQuestion {
    public static void main(String[] args) {
        /*
        Verilen bir cumlede istenen bir String icin
        asagidakilerden uygun olani yazdirin
        1. aradiginiz kelime 1 kez kullanilmis
        2. aradiginiz kelime 2 kez kullanilmis
        3. aradiginiz kelime 2 den fazla kullanilmis
        4. aradiginiz kelime cumlede hic kullanilmamis
        */
        String cumle= "Yasasin java java, iyi ki java ogreniyorum";
        String kelime= "java";

        if (cumle.indexOf(kelime)==(-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        }else {//le mot est dans le phrase definitivement//
            int kelimeIlkIndeksi=cumle.indexOf(kelime);//8 on a trouve premiere index de java
            if (cumle.indexOf(kelime, (kelimeIlkIndeksi+1))==-1){
                System.out.println("aradiginiz kelime 1 kez kullanilmis");
            } else  {
                int kelimeIkinciIndeksi=cumle.indexOf(kelime, (kelimeIlkIndeksi+1));
                if (cumle.indexOf(kelime, (kelimeIkinciIndeksi+1))==-1){
                    System.out.println("aradiginiz kelime 2 kez kullanilmis");
                }else{
                    System.out.println("aradiginiz kelime 2 den fazla kullanilmis");
                }
            }
        }

    }
}
