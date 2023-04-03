package Questions_WiseQuarterPart02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course19_ArrayList05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the fibonacci numbers: ");
        int num=scan.nextInt();
        List<Integer> fibonaciNumbers=fibList(num);
        System.out.println(fibonaciNumbers);
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
