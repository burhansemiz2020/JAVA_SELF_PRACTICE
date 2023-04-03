package Questions_Scope;

import java.util.Scanner;

public class Q01_ScopeKonuAnlatimi {
    public static void main(String[] args) {
        /*
        Scope bir variable’in erisilebildigi alandir.
        Scope, variable’in olusturuldugu yer goz
        onunde bulundurularak 2 ana gruba ayrilir.
        1- Local variable’lar: Local variable’lar bir method veya kod
        blogu icerisinde olusturulan variable’lardir.
        2- Class level variable’lar : Class level variable’lar method ve kod
        bloklarinin disinda olusturulurlar ve scope’lari tum class’dir.
        Local variable’larin scope’u icerisinde olusturulduklari kod blogudur ve o blogun
        disinda kullanilamazlar. Ancak static keyword kullanilip
        kullanilmamasina gore erisimleri ve
        kullanimlari farkli olur.

        ***STATIC CLASS VARIABLE
        ***INSTANCE OBJECT VARIABLE

        YILDIZ HASTANESI ORNEGI VEYA
        EVIMIZIN ISIGINI YAKTIGIMIZDA KENDI EVIMIZ AYDINLANIR. BU INSTANCE
        AMA GUNES HER EVI AYDINLATIR BU DA STATIC
         */
        /*
        2- Class level variables
        KURAL 1
        Static veya instance variable’lara deger atama mecburiyeti yoktur.
        Biz deger atamasi yaparsak, o degeri kullanir. Deger
        atamazsak Java variable’lar icin default olarak tanimlanan
        degerleri assign eder ve onlari kullanir.

        DEFAULT DEGERLER:
        String : null
        Sayisal primitive’ler : 0
        Char : hiclik
        Boolean : false
        ======================================================
        KURAL 2
        Static variable’lar, static
        olduklari icin tum class’dan direk
        kullanilabilirler,
        (tum static method’lar ve static
        olmayan method’lardan)
        Instance variable’lar static
        olmadiklari icin static method’lardan
        direk kullanilamazlar.
        Instance variable’lara static
        method’lardan ulasmak ve/veya
        kullanmak icin obje olusturmamiz
        gerekir.
        Instance variable’lari static olmayan
        method’lardan direk kullanabiliriz.
         */
        /*
        Scope : Class icerisinde olusturulan
        variable’larin kapsamini (nereden
        eriselebilecegini) belirler
        Class Level’da olusturulan variable’lar
        class’in tamaminda gecerlidir, ancak direk
        erisim icin static keyword belirleyicidir;

        1- static olarak tanimlanan variable’lara tum method’lardan ulasilabilir

        2- static olarak tanimlanmayan (instance) variable’lara sadece static olmayan
        method’lardan ulasilabilir. Local olarak olusturulan variable’lar sadece
        tanimlandiklari scope’da gecerlidirler. (Herkes oturdugu mahallede taninir)

        3- bir method’da olusturulan variable’lara sadece o method’dan ulasilabilir

        4- Loop icerisinde olusturulan variable’a loop disindan erisilemez
         */


    }
}
