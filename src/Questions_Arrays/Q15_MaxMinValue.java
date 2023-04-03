package Questions_Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

public class Q15_MaxMinValue {
    public static void main(String[] args) {
        /*
        10. Write a Java program to find the maximum and minimum value of an array.
         */
        int [] arr = {1, 2, 3, 4, 5, 6};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];

            }
            if (arr[i]< min){
                min=arr[i];
            }
        }


        System.out.println("The max value of the array is: " +max);//The max value of the array is: 6
        System.out.println("The min value of the array is: " +min);//The min value of the array is: 1
        /*
        Bu program bir dizi oluşturur ve ardından bu dizi
        içerisindeki maksimum ve minimum değerleri bulmak
        için bir döngü kullanır. Döngü, dizinin her elemanını
        tek tek kontrol eder ve eğer bir eleman, şu ana kadar
        bulunan maksimum veya minimum değerleri aşarsa ya da
        altına düşerse, ilgili değişkenleri günceller.
        Son olarak, program, maksimum ve minimum değerleri
        ekrana basar. Bu programı farklı diziler için de
        kullanabilirsiniz.
         */

    }


}

