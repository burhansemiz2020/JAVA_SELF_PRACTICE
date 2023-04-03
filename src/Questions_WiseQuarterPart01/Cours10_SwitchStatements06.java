package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours10_SwitchStatements06 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numMonth: ");
        int numMonth=scan.nextInt();
        switch(numMonth){
            case 1:

            case 2:
                System.out.println("Winter");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("Spring");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("Summer");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
    }
