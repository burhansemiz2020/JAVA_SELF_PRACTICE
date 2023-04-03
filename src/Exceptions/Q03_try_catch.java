package Exceptions;

public class Q03_try_catch {
    public static void main(String[] args) {
        int num1=20;
        int num2=0;
        try {
            System.out.println(num1 / num2);
            System.out.println("try1");
            System.out.println("try2");
            System.out.println("try3");
        } catch (ArithmeticException e) {
            System.out.println("Diviser not been 0");

        }
    }
}
