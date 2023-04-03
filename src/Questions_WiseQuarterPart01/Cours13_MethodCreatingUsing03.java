package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours13_MethodCreatingUsing03 {
    public static void main(String[] args) {
        //iki sayi alin
        //toplamlarini ayzdirin
        sumTwoNum();
        sumTwoNum();

    }public static void sumTwoNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two num : ");
        double num1 =scan.nextDouble();
        double num2 =scan.nextDouble();

        System.out.println(num1+num2);

    }
}
