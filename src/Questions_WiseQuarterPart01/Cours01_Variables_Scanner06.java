package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner06 {
    public static void main(String[] args) {
     /*
    Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
     */
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double rad= scan.nextDouble();
        //for
        double circumference=2*3.14*rad;
        System.out.println("Circumference of the circle is= " +circumference);
        double area=3.14*rad*rad;
        System.out.println("Area of the circle is= " +area);
        /*
        Enter the radius of the circle:
        5
        Circumference of the circle is= 31.400000000000002
        Area of the circle is= 78.5
         */

    }
}
