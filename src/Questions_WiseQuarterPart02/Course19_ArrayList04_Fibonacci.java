package Questions_WiseQuarterPart02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course19_ArrayList04_Fibonacci {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
        bize ilk n tane tane Fibonacci sayisini bir list
        olarak donduren bir method olusturun.
         */
        //0 1 1 2 3 5 8 13 21 34 55 89
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the fibonacci numbers: ");
        int num=scan.nextInt();
        List<Integer>fibonaciNumbers=fibList(num);
        System.out.println(fibonaciNumbers);
        /*
        Enter the size of the fibonacci numbers:
        10
        [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
         */

    }
    public static List<Integer>fibList(int numCount){
        List<Integer>fibNum=new ArrayList<>();
        if (numCount<=0) System.out.println("Wrong entry");
        else if (numCount==1) {
            fibNum.add(0);
        } else if (numCount==2) {
            fibNum.add(0);
            fibNum.add(1);
        } else{
            int firstNum=0;
            fibNum.add(firstNum);
            int secNum=1;
            fibNum.add(secNum);
            int newNum=firstNum+secNum;
            fibNum.add(newNum);

            while(fibNum.size()<numCount){
                firstNum=secNum;
                secNum=newNum;
                newNum=firstNum+secNum;
                fibNum.add(newNum);
            }
        }return fibNum;
    }

    }

