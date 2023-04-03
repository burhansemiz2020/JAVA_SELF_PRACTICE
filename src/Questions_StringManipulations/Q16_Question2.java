package Questions_StringManipulations;


public class Q16_Question2 {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicinin belirli bir formatta
        verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €
         */
        String input1="15.30 €";
        String input2="11.40 €";

        input1=input1.replaceAll("\\D", "");
        input2=input2.replaceAll("\\D", "");

        double inpt1=Double.parseDouble(input1);
        double inpt2=Double.parseDouble(input2);

        System.out.println((inpt1+inpt2)/100 + "€");



    }
}
