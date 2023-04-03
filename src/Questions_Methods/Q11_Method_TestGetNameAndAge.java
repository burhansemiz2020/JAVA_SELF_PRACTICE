package Questions_Methods;

import javax.naming.Name;
import java.util.Scanner;

public class Q11_Method_TestGetNameAndAge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=Q11_Method_GetNameAndAge.getName();
        System.out.print("Enter your age : ");
        double age=Q11_Method_GetNameAndAge.getAge();




        System.out.println("Your name and age : " +name+ " , " +age);

    }
}
