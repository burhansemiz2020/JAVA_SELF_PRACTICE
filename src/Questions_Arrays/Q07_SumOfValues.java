package Questions_Arrays;

public class Q07_SumOfValues {
    public static void main(String[] args) {
        /*
        2. Write a Java program to sum values of an array.
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("The sum of the num is: " +sum);

    }
}
