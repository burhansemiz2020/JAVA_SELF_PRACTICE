package Questions_Arrays;

public class Q08_MakeGrid {
    public static void main(String[] args) {
        /*
        3. Write a Java program to print the following grid.
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
         */
        int [][]arr=new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)

            {
                System.out.printf("%2d" , arr[i][j]);
            }
            System.out.println();
        }

    }
}
