package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner04 {
    public static void main(String[] args) {
    /*
    Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the short line of the rectangle: ");
        double shortLine=scan.nextDouble();
        System.out.println("Enter the long line of the rectangle: ");
        double longLine=scan.nextDouble();
        double areaFormula=shortLine*longLine;
        System.out.println("The area of the rectangle is: " +areaFormula);
        /*
        Enter the short line of the rectangle:
        15
        Enter the long line of the rectangle:
        20
        The area of the rectangle is: 300.0
         */

    }
}
