package Questions_Scope;

public class Hastane {
    public static void main(String[] args) {
        Doktor dok1=new Doktor();//Doktor classinda buraya cagiriyoruz. Scanner scan gibi
        dok1.isim="Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim);//burada parantez icine dok1 yazmazsak cagirim
        // yapmaz. Cunku bu degiskenler doktor calssinin

        Doktor dok2=new Doktor();
        System.out.println(dok2.isim);//burada atanmis bir deger olmadigi icin null yazdirir
        dok2.soyisim = "Celik";
        System.out.println(dok2.soyisim);//Celik yazar kafasi karsimaz

        System.out.println(dok1);//Questions_Scope.Doktor@6d03e736 bu sekilde bir output aldik.
        //bunun nedeni dok1 in yanina variable in konulmamasidir. dok1 dedigimizde bunun
        //referansini yazdirir.
        System.out.println(dok1.fakulte);//Tip//Static member 'Questions_Scope.Doktor.fakulte' accessed via instance reference
        System.out.println(dok2.fakulte);

        dok1.isim="Burcu";
        System.out.println(dok2.isim);//Tip fakultesi
        dok1.fakulte="Tip fakultesi";//burda statik bir deger olan fakultenin ismi
        // degisince alttaaki dok2 nin de ismi ortomatik olarak degisti
        //
        System.out.println(dok2.fakulte);//Tip fakultesi
        Doktor dok3=new Doktor();
        System.out.println(dok3.dogumYili);//0
        System.out.println(Doktor.fakulte);//Tip fakultesi//static variable icin tavsiye edilen erisim
        // yontemi class ismi.uye ismi. buna static yontem denir.


    }
}
