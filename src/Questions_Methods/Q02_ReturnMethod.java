package Questions_Methods;

public class Q02_ReturnMethod {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        String isim= "burhan";
        String soyisim="semiz";

        String isimSoyisim = isimDuzenle(isim, soyisim);
        System.out.println("ilk girilen         : " + isim + " " + soyisim);
        System.out.println("degistirilmis hali  : " + isimSoyisim);
    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                               isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+
                                  soyisim.substring(1).toLowerCase();
        return isimDuzenlenmis + " " + soyisimDuzenlenmis;
    }
}
