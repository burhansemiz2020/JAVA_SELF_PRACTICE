package Questions_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions_ArrayListTekrarEdenSayilariSil {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};
        //bos list olusturuyoruz
        List<Integer> tekrarlariSilList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarlariSilList.contains(arr[i])){
                tekrarlariSilList.add(arr[i]);
            }

        }
        System.out.println(tekrarlariSilList);
        arr=new int [tekrarlariSilList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarlariSilList.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }
}
