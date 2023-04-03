package Questions_WiseQuarterPart02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course19_ArrayList02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
        Q’ya bastiginda girdigi isimleri bize
        liste olarak dondurecek bir method olusturun.
         */
        System.out.println(theMethodOfNames());
    }
    public static List<String>theMethodOfNames(){
        List<String>newNames=new ArrayList<>();
        String names="";
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Enter the names:");
            names= scan.nextLine();
            if (!names.equalsIgnoreCase("q")){
                    newNames.add(names);
            }
        }
        while (!names.equalsIgnoreCase("q"));
            return newNames;
    }
}
