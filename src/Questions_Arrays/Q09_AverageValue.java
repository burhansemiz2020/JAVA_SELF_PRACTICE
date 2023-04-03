package Questions_Arrays;

public class Q09_AverageValue {
    public static void main(String[] args) {
        /*
        4. Write a Java program to calculate the average value of array elements.
         */
        int [] arr={20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("The value of the average is: " + avg);
    }
}
