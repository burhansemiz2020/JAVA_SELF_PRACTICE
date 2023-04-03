package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours06_IfElseStatements04 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir ucgenin 3 kenar
        uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three lines of a triangle: ");
        double line1 = scan.nextDouble();
        double line2 = scan.nextDouble();
        double line3 = scan.nextDouble();

        if (line1 == line2 && line2 == line3){
            System.out.println("This is an equilateral triangle");
        }
        /*
        Enter the three lines of a triangle:
        12
        12
        12
        This is an equilateral triangle
         */

    }
}
