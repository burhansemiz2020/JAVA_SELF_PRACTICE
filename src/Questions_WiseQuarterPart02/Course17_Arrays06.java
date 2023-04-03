package Questions_WiseQuarterPart02;

public class Course17_Arrays06 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun.
         */
        String[]arr={"Melike", "Burkay", "Inci", "Eda", "Emre","su"};

        longShortNames(arr);
        /*
        Long name in the Array: Melike
        Short name in the Array: Eda
         */
        String[]arr2={"Melike", "Burkay", "inci", "Eda", "Emre", "Huseyin", "Su"};
    }
    public static void longShortNames(String[]arr){
        String longName=arr[0];
        String shortName=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i].length()<longName.length()){
                longName=arr[i];
            }
            if(arr[i].length()>shortName.length()){
                shortName=arr[i];
            }
        }
        System.out.println("Long name in the Array: " + longName);
        System.out.println("Short name in the Array: " + shortName);

    }
}
