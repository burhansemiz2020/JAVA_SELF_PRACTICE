package Questions_StringManipulations;

public class Q10_LastIndexOf {
    public static void main(String[] args) {
        String str = "Java bazen beyin yakar";
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a", 2));
        System.out.println(str.lastIndexOf("a", 19));
        System.out.println(str.indexOf("a", 4));
        System.out.println(str.lastIndexOf("a", 17));
        /*
        dans cette exemple on cherche character "a" au debut et a la fin
        dans le mem temps
        et meme il accept char aussi
        maintenan on peut faire le dernier exemple
        qui etait difficile avec cette methode
         */

         /*
        Verilen bir cumlede istenen bir String icin
        asagidakilerden uygun olani yazdirin
        1. aradiginiz kelime 1 kez kullanilmis
        2. aradiginiz kelime 2 kez kullanilmis
        3. aradiginiz kelime 2 den fazla kullanilmis
        4. aradiginiz kelime cumlede hic kullanilmamis
        */
        String cumle = "Yasasin java java , iyi ki java ogreniyorum";
        String kelime = "java";
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
