package Questions_Methods;

public class Q01_VoidMethod {
    public static void main(String[] args) {
        /*
        Input olarak verilen satis fiyati
        musteri karti var mi? ve uyeligi kac
        yillik? bilgilerini degerlendirip,
        - uye degilse %5 indirim
        - uyeligi var ama 5 yildan az ise %10
        - uyeligi var ve 5 yildan cok ise %15
        indirim uygulayip :
        - asil fiyati
        - indirim miktarini
        - indirimli fiyati
        yazdiran bir method olusturun
         */
        boolean uyeMi=true;
        int uyelikYili=3;
        double satisFiyati=250;

        /*
        methodu calistiracak formul
         */
        indirimliFiyatHesapla(uyeMi, uyelikYili, satisFiyati);


    }
    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satisFiyati){
        //nested if ile
        if (uyeMi){
            if (uyelikYili<5){
                System.out.println("Urun Fiyati: " +satisFiyati);
                System.out.println("Indirim Miktari: " +satisFiyati*0.1);
                System.out.println("Indirimli Fiyat: " +(satisFiyati-satisFiyati*0.1));

            }else {
                System.out.println("Urun Fiyati: " +satisFiyati);
                System.out.println("Indirim Miktari: " +satisFiyati*0.15);
                System.out.println("Indirimli Fiyat: " +(satisFiyati-satisFiyati*0.15));
            }
            }else {
                System.out.println("Urun Fiyati: " +satisFiyati);
                System.out.println("Indirim Miktari: " +satisFiyati*0.05);
                System.out.println("Indirimli Fiyat: " +(satisFiyati-satisFiyati*0.05));
        }

    }

}
