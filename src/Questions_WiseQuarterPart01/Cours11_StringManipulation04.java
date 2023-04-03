package Questions_WiseQuarterPart01;

public class Cours11_StringManipulation04 {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi
        String fiyatlari toplayip yazdirin.
        input1 : “15.30 €”,
        input2 : “11.40 €”
        output : 26.70 €
         */
        String input1 = "15.30 €";
        String input2 = "11.40 €";
        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");

        double inpt1=Double.parseDouble(input1);
        double inpt2=Double.parseDouble(input2);
        double result=inpt1+inpt2;
        System.out.println((result/100) + " €");



    }

}
