package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q02_SumOfTheValues {
    public static void main(String[] args) {


    /*
    Kullanicidan istedigi kadar tamsayi alip toplayin
    kullanici q ya bastiginda islemi sonlandirip kac
    sayi girildigini ve toplamini yazdirin q veya Q
    disinda tamsayi olmayan bir deger girilirse hata
    mesaji verip, yeni deger isteyerek isleme devam edin
     */
    int count=0;
    int sum=0;
    int inputNum=0;
    Scanner scan=new Scanner(System.in);
    do{
        System.out.println("enter the numbers for sum\n For end press q");
        try {

            inputNum=scan.nextInt();//q veya Q girerse exception olusur
            sum+=inputNum;
            count++;
        } catch (InputMismatchException e) {

            char input=scan.next().charAt(0);
            if (input =='q'|| input =='Q'){
                System.out.println("input " +count+ " sum " + sum);
                break;
            }else {
                System.out.println("enter the digit number");
            }

        }
    }
    while(true);
        System.out.println("That's all");
    }
    }
