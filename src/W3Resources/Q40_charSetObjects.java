
package W3Resources;

import java.nio.charset.Charset;

public class Q40_charSetObjects {
    public static void main(String[] args) {
        /*
        Write a Java program to list the available character sets in charset objects.
         */
        System.out.println("Write the list of available character sets");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
