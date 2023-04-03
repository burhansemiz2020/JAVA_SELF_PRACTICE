package Questions_ForLoops;

public class Q24_ForLoops_Question {
    public static void main(String[] args) {
        /*

        ----*       ==>4
        ---***      ==>3
        --*****     ==>2
        -*******    ==>1
        *********   ==>0
         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");



        }

    }
}
