package Questions_Arrays;

import java.util.Arrays;

public class Q24_MatricesOfTheSimeSize {
    public static void main(String[] args) {
        /*
        19. Write a Java program to add two matrices of the same size.

        Bu soruda ozellikle multidimensional arrays konusuna atif var
        Bu arada Scanner ile array alma konusuna calismam gerekiyor.
        ozellikle multidimensional olanlarda
         */

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix1));
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println(Arrays.deepToString(matrix2));
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }

        }
        // Print the result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }
    }
}
/*
        İki boyutlu result dizisini, matrix1 ve matrix2 dizileriyle aynı boyutta olacak
        şekilde tanımlıyoruz. Bu diziyi sonuç matrisi olarak kullanacağız.


        İki for döngüsü kullanarak matrix1 ve matrix2 dizilerindeki elemanları
        toplayarak result dizisindeki ilgili elemana yerleştiriyoruz.
        İç içe geçmiş iki for döngüsü, tüm elemanları gezinmek için kullanılır.
        for döngüsü içindeki 3, örnek kodda kullanılan matrislerin boyutudur.
        Örnek kodda iki tane 3x3 boyutunda matris kullanılır, bu nedenle for
        döngüsü içinde boyutu 3 olarak belirtiyoruz. Genel olarak, for döngüsü
        içinde kullanılan sayı, işlemin kaç kez yürütüleceğini belirtir.
        Burada iki boyutlu bir matrisin boyutunu belirleyen bir sayıdır.
        Eğer farklı boyutlarda matrisler kullanıyorsanız, for döngüsünde
        boyutları bu sayılarla değiştirmeniz gerekebilir.
        Özetlemek gerekirse, bu kod örneği, iki boyutlu dizilerdeki elemanları
        toplama işlemi yapar ve sonuçları ekrana yazdırır. Bu örnek, iki boyutlu
        dizilerin nasıl kullanılabileceğine bir örnek teşkil eder.
         */
