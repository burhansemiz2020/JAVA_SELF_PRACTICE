package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements02 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri
        emekli olabilir. Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin ..
        Yil daha calisman gerekir” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your gender: Man=M or m//Woman=W or w");
        char gender=scan.next().toUpperCase().charAt(0);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();

        if (gender=='W' && (age>=60 && age<=80)){
            System.out.println("You can retire");


        } else if (gender== 'W' && (age<60&&age>17)){
                System.out.println("Fore retirement you have to work: " +(60-age)+ " years");


        }if (gender=='M' && (age>=65 && age<=80)){
            System.out.println("You can retire");

        } else if (gender== 'M' && (age<65&&age>17)){
            System.out.println("Fore retirement you have to work: " +(65-age)+ " years");


        }
    }
}
