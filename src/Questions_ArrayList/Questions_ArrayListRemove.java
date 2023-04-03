package Questions_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Questions_ArrayListRemove {
    public static void main(String[] args) {


    List<String> harfler=new ArrayList<>();
    harfler.add("A");
    harfler.add("B");
    harfler.add("K");
        System.out.println(harfler);
        System.out.println(harfler.remove("B"));//true
        System.out.println(harfler);

        System.out.println("****************");

        /*
        Array list ile letters adinda bir bos list olusturun
        bu list in icine 4 harf ekleyin daha sonra son harfini silin
         */
        List<String> letters=new ArrayList<>();
        letters.add("D");
        letters.add("E");
        letters.add("M");
        letters.add("N");
        System.out.println(letters);

        int LastIndex=letters.size()-1;//son indexi sildim
        letters.remove(LastIndex);
        System.out.println(letters);

        System.out.println("----------------------------");
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(18);
        numbers.add(2);

        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        Integer removeNumber=1;
        numbers.remove(removeNumber);
        System.out.println(numbers);//[18, 2]





    }
}
