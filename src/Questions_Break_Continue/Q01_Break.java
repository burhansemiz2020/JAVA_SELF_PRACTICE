package Questions_Break_Continue;

public class Q01_Break {
    public static void main(String[] args) {
        /*
        break sadece icteki donguyu sonlandirir
        yani kendi bulundugu donguyu
         */
        int i =0;
        while (i<20){
            if (i==10){
                break;//dongu burada bitti
            }

            System.out.println("i = " +i);
            i++;

        }
    }
}
