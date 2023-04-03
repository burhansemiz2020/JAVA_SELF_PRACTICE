package Questions_NestedForLoops;

public class Q03_NestedForLoops_SatirSutun {
    public static void main(String[] args) {
        /*
        1               1. satir 1’den 1’e kadar yazdir
        1 2             2. satir 1’den 2’e kadar yazdir
        1 2 3           3. satir 1’den 3’e kadar yazdir
        1 2 3 4.        4. satir 1’den 4’e kadar yazdir
         */


        int sayi=4;

        for (int i=1; i <=sayi; i++) {
            for (int j=1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("======");

        int satir=4;

        for (int i=4; i >=1; i--) {
            for (int j=1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }



    }
}
