package Questions_StringManipulations;

public class Q17_Question3 {
    public static void main(String[] args) {
        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.
         */
        String input="java1 ogRe2@nMek3 #ne +Gu=zel".toLowerCase();
        input = input.trim();


        input=input.replaceAll("\\d", "");
        input=input.replaceAll(" ", "5");
        input=input.replaceAll("\\W", "");
        input=input.replaceAll("5", " ");
        String inpt=input.substring(0, 1).toUpperCase() + input.substring(1);//burada ilk harfi buyuk yaptik
        System.out.println(inpt);


    }
}
