package Questions_WiseQuarterPart02;

public class Course19_ArrayList07 {
    public static void main(String[] args) {
        /*
        verilen sayinin pozitif bolenleri sayisi
        10 dan cok ise guzel az ise kotu yazdirin
         */
        int sayi = 10;
        int pozitifTamBolenlerSayisi=Course19_ArrayList06.pozitifBolenleriListesi(sayi).size();
        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else{
            System.out.println("Kotu");
        }
    }
}
