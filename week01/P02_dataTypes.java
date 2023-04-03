package week01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*
        byte    : sadece tamsayi degeri alir        = 8 bit
        short   : sadece tamsayi degeri alir        = 16 bit
        int     : sadece tamsayi degeri alir        = 32 bit
        long    : sadece tamsayi degeri alir        = 64 bit
        
        
        float   : ondalikli sayi degerlerini alir   = sonuna f zorunlu
        double  : ondalikli sayi degerlerini alir   = sonuna d konulabilir
        
        boolean : true ya da false verir            =
        char    : tek tirnak icinde tek karakter
                  tirnak icinde olmadan sayi yazilabilir(ASCII)
                  
        double>float>long>int>short>byte

        hepsi tamsayi degeri aliyorsa neden farkli
        farkli data types kullaniyoruz?
         */
        byte b1=Byte.MAX_VALUE;
        System.out.println("b1 = " + b1);
        long l1=Long.MAX_VALUE;

        System.out.println("l1 = " + l1);
        int i1= Integer.MAX_VALUE;
        System.out.println("i1 = " + i1);//soutv kisa komutu degerle yazdirir.
    }
}
