package Questions_WiseQuarterPart02;


import java.util.Arrays;
import java.util.Scanner;

public class Course17_Arrays05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
         */
        String[] arr = createArray.createArray();
        System.out.println(Arrays.toString(arr));

    }

    public class createArray {
        public static String[] createArray() {
            Scanner input = new Scanner(System.in);
            System.out.print("size of the array: ");
            int size = input.nextInt();
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.print("index of the element " + i + ": ");
                String element = input.next();
                array[i] = element;
            }
            return array;
        }
    }
}
