package Questions_Arrays;

import java.util.Scanner;

public class Q17_ReverseIntegerMethodScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Input the size of the array: ");
        int size=scan.nextInt();
        int[]arr=new int[size];

        System.out.println("Input the elements of the array: " + " , ");
        for (int i = 0; i < size; i++) {
            arr[i]= scan.nextInt();
        }
        reverseArr(arr);
        System.out.print("Arr; ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static int reverseArr(int[]arr){
        int left=0;
        int right=arr.length-1;

        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr[0];
        /*
        Bu programın çalışma mantığı şu şekildedir:
        Kullanıcıdan dizinin boyutu girilmesi istenir.
        Bir int dizisi oluşturulur ve boyutu kullanıcının
        girdiği değere ayarlanır. Kullanıcıdan dizinin
        elemanları girilmesi istenir ve dizinin her bir
        elemanı, döngü kullanılarak kullanıcı tarafından
        girilen değerlerle değiştirilir. reverseArray()
        adlı metot, diziyi tersine çevirmek için kullanılır.
        Dizi, baştan sona doğru bir döngü kullanarak yazdırılır.
        Scanner nesnesi kapatılır.
        reverseArray() metodu, bir int dizisi alır ve diziyi
        tersine çevirir. Bu metot, sol ve sağ indislerin
        başlangıçta 0 ve dizinin son indisine ayarlanmasıyla başlar.
        Daha sonra, sol indis sağ indisi geçene kadar bir
        döngü kullanarak, sol ve sağ indislerin değerleri
        arasındaki elemanları bir geçici değişkende saklar
        ve yerlerini değiştirir. Bu işlem sol indis sağ
        indisten büyük olduğunda sona erer ve ters çevrilmiş
        dizi geri döndürülür.
         */
    }
}
