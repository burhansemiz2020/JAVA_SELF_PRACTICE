package Questions_WiseQuarterPart01;


public class Cours13_MethodCreatingUsing01 {
    public static void main(String[] args) {
        /*
        verdigimiz bir sayinin faktoryelini hesaplayin
        sonucu bize donduren metot olusturun
         */

    int result=countFaktoryel(5);
    System.out.println(result);
    }
    public static int countFaktoryel(int num) {

        int fak=1;
        for(int i=1;i<=num;i++) {
            fak*=i;
        }
        return fak;



    }
}
