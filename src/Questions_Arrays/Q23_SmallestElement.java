package Questions_Arrays;

import java.util.Arrays;

public class Q23_SmallestElement {
    public static void main(String[] args) {
    /*
    18. Write a Java program to find the second smallest element in an array.
     */

        int[] arr = {54, 64, 21, 87, 96, 42, 15, 54, 86, 42, 19, 54, 86, 74, 65, 11};
        System.out.println("The given numbers are: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        int secondMin=arr[1];
        System.out.println(secondMin);
        /*
        Bu programda, önce Arrays.sort yöntemi kullanılarak dizi küçükten büyüğe sıralanır.
        Daha sonra, ikinciEnKucuk adlı değişkene dizinin ikinci elemanı atanır.
        Son olarak, ikinciEnKucuk değişkeni konsola yazdırılır. Bu yöntem, sıralama işlemi
        nedeniyle daha yavaş olabilir, ancak kod daha kısa ve daha anlaşılır olabilir.
        DIGER BIR COZUM YONTEMI ISE SU SEKILDEDIR:
                        System.out.println("Original numeric array : "+Arrays.toString(my_array));
                    int min = Integer.MAX_VALUE;
                    int second_min = Integer.MAX_VALUE;
                    for (int i = 0; i < my_array.length; i++) {
                        if(my_array[i]==min){
                          second_min=min;
                        } else if (my_array[i] < min) {
                            second_min = min;
                            min = my_array[i];
                        } else if (my_array[i] < second_min) {
                            second_min = my_array[i];
                        }

                    }
                    System.out.println("Second lowest number is : " + second_min);
                    }
                }
         */
    }
}
