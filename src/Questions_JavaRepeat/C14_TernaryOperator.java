package Questions_JavaRepeat;

public class C14_TernaryOperator {
    public static void main(String[] args) {
        /*
        input olarak verilen sayiyi
        kontrol edip, sayi cift ise "cift sayi"
        tek ise "tek sayi" yazdiriniz
         */
        int input=2;
        //if else ile yapalim
        if (input%2==0) System.out.println("cift sayi");
        else System.out.println("tek sayi");

        //ternary ile yaparsak

        System.out.println(input%2==0 ? "cift sayi" : "tek sayi");

        /*
        TERNARY I OZELLIKLE SIMPLE OPERATION LARDA USAGE EDERSEK PLUS EFFICACE OLUR
         */
    }
}
