package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours10_SwitchStatements05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the dayNumber: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Mid Days");
                break;
            case 6:

            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }

    }

}
