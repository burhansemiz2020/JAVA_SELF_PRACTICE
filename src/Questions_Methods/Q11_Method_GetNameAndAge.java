package Questions_Methods;

import java.util.Scanner;

public class Q11_Method_GetNameAndAge {
    public static void main(String[] args) {
        System.out.println("Enter your name and age: ");
        System.out.println(getName() + " , " + getAge());


    }
    public static String getName(){
        return new Scanner(System.in).nextLine();
    }
    public static double getAge(){
        return new Scanner(System.in).nextDouble();
    }
}
