package Questions_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Questions_ArrayList_Sub {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(53);
        sayilar.add(22);

        System.out.println(sayilar);
        System.out.println(sayilar.subList(2,5));
        System.out.println(sayilar);

    }
}
