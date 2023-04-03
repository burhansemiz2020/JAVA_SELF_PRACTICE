package Questions_ForLoops;

public class Q23_ForLoops_Question {
    public static void main(String[] args) {
        /*
        999999999999999999
        88888888  88888888
        7777777    7777777
        666666      666666
        55555        55555
        4444          4444
        333            333
        22              22
        1                1


         */

        int a = 9;
        int b = 10;
        for (int i = a; i >=1 ; i--) {
            if (i!=9 && i!=8){
                b++;
            }
            for (int j = 1; j <=18 ; j++) {
                if (i==9){
                    System.out.print(i);
                } else if (j>=i+1 && j<=b) {//(i=8) 9 , 10
                    System.out.print(" ");
                }else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
        }
    }

