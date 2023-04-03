package Questions_Arrays;

public class Q02_Arrays_KonuAnlatimi {
    public static void main(String[] args) {
        int[] arr={3,4,5,6};
        int [] yeniArr=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=7;
        arr=yeniArr;
    }
}
