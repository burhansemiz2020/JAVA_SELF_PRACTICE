package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours06_IfElseStatements05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan notunu alin
        50 veya daha buyukse ”Sinifi Gectin”,
        50’den kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score: ");
        double score=scan.nextDouble();

        if (score>=50){
            System.out.println("You passed the class");
        }if (score<50){
            System.out.println("Sorry you failed");
        }
        /*
        Enter your score:
        48
        Sorry you failed
        =====
        Enter your score:
        55
        You passed the class
         */
    }
}
