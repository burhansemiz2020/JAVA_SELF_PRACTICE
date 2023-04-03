package Questions_WhileLoops;

public class Q07_WhileLoopsQuestion01 {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        yazdirin.
        */

        int baslangic=10;
        int bitis=99;
        while (baslangic<bitis){
            if (baslangic%7==0){
                System.out.print(baslangic+ " ");

            }
            baslangic++;

        }


    }


}





