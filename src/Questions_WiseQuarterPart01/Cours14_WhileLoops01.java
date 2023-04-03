package Questions_WiseQuarterPart01;

public class Cours14_WhileLoops01 {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        yazdirin.
         */
        int numStart=10;
        int numEnd=99;
        int num;
        while(numStart<numEnd){
            if (numStart%7==0){
                System.out.println(numStart + " ");
            }
            numStart++;

        }



    }
}
