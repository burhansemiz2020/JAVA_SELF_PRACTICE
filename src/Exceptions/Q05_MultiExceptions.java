package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q05_MultiExceptions {
    public static void main(String[] args) {
        String str="Java her gecen gun guzellesiyor";
        int[] arr={3,4,6,3,6,7,4,2,5,7};
        Scanner scan=new Scanner(System.in);
        System.out.println("Index olarak 0 veya pozzitif tamsayi girin");


        try {
            int index=scan.nextInt();//InputMismatchException
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisin");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Girilen index String sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }
    }
}
