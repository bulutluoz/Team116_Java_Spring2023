package day26_inheritanceDataTypeKullanimi_overriding;

public class CAvciKuslar extends BKuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        /*
            Asagidaki 3 obje'de ayni constructor kullanmistir
            yani 3'u de avci kustur
            Ama data turu farkli secildigi icin
            ozellikleri farkli olur

            Bir obje olusturulurken
            -   eger cons ve data turu ayni ise
                o class'a gidilir
                aranan ozellik varsa kullanilir,
                yoksa parent class'lara da bakilir
                ilk bulunan VARIABLE gecerli olur
            -   cons ve data turu farkli ise
                obje constructor olan class'dan olusturulsa da
                ozelliklerin data turu olan class'daki gibi olmasini isteriz
                bir VARIABLE'IN degerini aramaya
                DATA TURU OLAN CLASS'DAN baslanir

           Bir obje olusturulurken data turu constructor'dan farkli ise
           tum variable'lari DataTuru olan class'a gore DUSUNMELIYIZ


         */

        CAvciKuslar avci1 = new CAvciKuslar();
        System.out.println(avci1.beslenme); // avci - et yerler
        System.out.println(avci1.gaga); // avci - sivri gagali
        System.out.println(avci1.cogalma); // kus - yumurta ile cogalir
        System.out.println(avci1.kanat); // kus - kanatlidir
        System.out.println(avci1.hareket); // avci - ucarlar
        System.out.println(avci1.pence); // avci - pencelidir
        System.out.println(avci1.solunum); // kus - akcigerle nefes alirlar
        System.out.println(avci1.omur);// hayvan - yasar ve olurler


        BKuslar avciKusgiller = new CAvciKuslar();
        // AvciKuslar is-a Kuslar
        System.out.println(avciKusgiller.beslenme); // hayvan - beslenirler
        System.out.println(avciKusgiller.gaga); // kus - gagalari vardir
        System.out.println(avciKusgiller.cogalma); // kus - yumurta ile cogalir
        System.out.println(avciKusgiller.kanat); // kus - kanatlidir
        System.out.println(avciKusgiller.hareket); // hayvan - hareket ederler
        // System.out.println(avciKusgiller.pence); // kuslar veya hayvanlar'da yok CTE
        System.out.println(avciKusgiller.solunum); // kus - akcigerle nefes alirlar
        System.out.println(avciKusgiller.omur);// hayvan - yasar ve olurler

        AHayvan avciHayvangiller = new CAvciKuslar();
        // AvciKuslar is-a Hayvan
        System.out.println(avciHayvangiller.beslenme); // hayvanlar - beslenir
        // System.out.println(avciHayvangiller.gaga); // Hayvanlarda yok CTE
        System.out.println(avciHayvangiller.cogalma); // hayvan - cogalirlar
        // System.out.println(avciHayvangiller.kanat); // Hayvanlarda yok CTE
        System.out.println(avciHayvangiller.hareket); // hayvan - hareket ederler
        // System.out.println(avciHayvangiller.pence); // Hayvanlarda yok CTE
        System.out.println(avciHayvangiller.solunum); // hayvan - nefes alirlar
        System.out.println(avciHayvangiller.omur);// hayvan - yasar ve olurler

    }
}
