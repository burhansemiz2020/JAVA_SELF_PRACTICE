package Questions_WiseQuarterPart02;

import java.util.*;

public class Course19_ArrayList01 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir array'de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

                int[] arr = {1,2,3,4,1,3,4,4,3,2,6};

        System.out.println(removeDelete(arr));

    }
            public static List<Integer>removeDelete(int [] arrRemove){
        List<Integer>newArr=new ArrayList<>();
                for (int i = 0; i < arrRemove.length; i++) {
                    if (!newArr.contains((arrRemove[i]))){
                        newArr.add(arrRemove[i]);

                    }

                }
                return newArr;
            }
        }