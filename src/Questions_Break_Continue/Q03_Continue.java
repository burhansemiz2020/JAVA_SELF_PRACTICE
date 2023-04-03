package Questions_Break_Continue;

public class Q03_Continue {
    public static void main(String[] args) {
        /*
        Continue kelimesi dongu de herhangi bir yerde kullanilmissa
        alttaki bloklara gecmiyor kosulu kontrol ettigi en bas noktaya
        geri gelir.
         */
        for (int i = 0; i < 10; i++) {
            if (i==3 || i==5){
                continue;//burada if cumlesinde
            }
            System.out.println("i = " +i );


        }
    }
}
