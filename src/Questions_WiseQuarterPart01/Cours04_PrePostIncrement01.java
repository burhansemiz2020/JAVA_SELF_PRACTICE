package Questions_WiseQuarterPart01;

import org.w3c.dom.ls.LSOutput;

public class Cours04_PrePostIncrement01 {
    public static void main(String[] args) {
        /*
        Soru : Asagidaki kod calistirilirsa konsolda gorunecek sonuclar neler olur?
         */
        int a=10;
        System.out.println("a'nin degeri : " + ++a);
        int b=a++;
        System.out.println("b'nin degeri : " + b);
        int c=b++ + a;
        System.out.println("c'nin degeri : " + c);
        System.out.println("Son toplam : " +(a+b+c));

        /*
        a=11
        b=11 (b degeri 13 e yukselip en sonda degeri artar)
        c=23
        sum=47
         */
    }
}
