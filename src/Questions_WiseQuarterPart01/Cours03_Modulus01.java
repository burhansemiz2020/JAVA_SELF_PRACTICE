package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours03_Modulus01 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan 4 basamakli pozitif bir
        tamsayi alip rakamlar toplamini bulalim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int num= scan.nextInt();
        int digit=num%10;
        int sum=digit; //bu asamada birler basamagini aldik

        num=num/10;
        digit=num%10;
        sum=sum+digit;//bu asamada onlar basamagindaki rakami aldik

        num=num/10;
        digit=num%10;
        sum=sum+digit;//bu asamada yuzler basamagindaki rakami aldik

        num=num/10;
        digit=num%10;
        sum=sum+digit;//bu asamada binler basamagindaki rakami aldik

        System.out.println("The sum of the number is = " + sum);
        /*
        Enter a four digit number:
        6548
        The sum of the number is = 23
        */

    }
}
