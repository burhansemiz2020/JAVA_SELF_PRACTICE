package Questions_ForLoops;

public class Q18_ForLoops_Udemy {
    public static class Q19_ForLoops_Udemy {
        public static void main(String[] args) {
            int i=0;
            int j=5;
            for (; i < 10 && j>0 ; i++, j--) {
                System.out.println("i = " +i);
                System.out.println("j = " +j);
            }
            /*
            i = 0
            j = 5
            i = 1
            j = 4
            i = 2
            j = 3
            i = 3
            j = 2
            i = 4
            j = 1
             */
        }
    }
}
