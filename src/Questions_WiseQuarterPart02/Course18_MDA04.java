package Questions_WiseQuarterPart02;

public class Course18_MDA04 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen 2 katli bir array’de bulunan
        tum sayilarin carpinini bize donduren bir
        method olusturun.
         */
        int[][] arr = {{1, 2}, {3, 4}, {5,6}};
        int result = multiply(arr);
        System.out.println(result);



    }
    public static int multiply(int [][] arr) {
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multiply *= arr[i][j];
            }
        }
        return multiply;

    }
}
