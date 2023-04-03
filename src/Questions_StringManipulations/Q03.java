package Questions_StringManipulations;

public class Q03 {
    public static void main(String[] args) {
        String str="Java ne kadar guzel";
        System.out.println(str.substring(8));//kadar guzel
        System.out.println(str.substring(0));//Java ne kadar guzel
        System.out.println(str.substring(str.length()-3));//zel

        System.out.println(str.substring(str.length()));//hiclik
        //
        System.out.println(str.substring(5, 7));//ne
        System.out.println(str.substring(3,4));

        //str in 5. karakterini yazdirin su
        // ana kadar biz bunu char ile yapiyorduk
        System.out.println(str.charAt(5));
        System.out.println(str.substring(5,6));
        System.out.println(str.substring(2,2));
    }
}
