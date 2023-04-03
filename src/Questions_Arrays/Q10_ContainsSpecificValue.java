package Questions_Arrays;

public class Q10_ContainsSpecificValue {
    public static void main(String[] args) {
        /*
        5. Write a Java program to test if an array contains a specific value.
        for integer
         */
        int[]arr={1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(arr, 2015));//false
        System.out.println(contains(arr, 2025));//false
        System.out.println(contains(arr, 1899));//true

    }
    public static boolean contains(int[]arr, int item){
        for (int a : arr) {
            if (item==a){
                return true;

            }

        }
            return false;

    }
}
