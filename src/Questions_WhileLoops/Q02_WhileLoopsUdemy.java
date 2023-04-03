package Questions_WhileLoops;

public class Q02_WhileLoopsUdemy {
    public static void main(String[] args) {
      int i=0;
      while (i<10) {
          System.out.println("i = " + i);
          // seklinde girersek bu dongu sonsuza
          // kadar devam eder.
          /*
          bunun devam etmemesi icin alta
          i++ ifadesi yazmak gerekmektedir.
          sonsuz dongu devam etmesi halinde ram leri
          ciddi sekilde mesgul eder
           */
          i++;
      }
    }
}
