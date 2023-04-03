package Questions_WiseQuarterPart01;

public class Cours15_DoWhileLoop01 {
    public static void main(String[] args) {
        /*
        Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin. Aralarinda virgul olsun
        ama son harften sonra virgul olmasin
         */
        char letter='k';
        do {
            System.out.print(letter + " , ");
            letter++;

        }
        while (letter<='t');
        System.out.println(letter);
    }
}
