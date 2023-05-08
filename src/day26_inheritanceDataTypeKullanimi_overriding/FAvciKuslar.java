package day26_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {
    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

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
                ilk bulunan METHOD gecerli olur
            -   eger cons ve data turu farkli ise
                Aramaya data turu secilen class'dan baslariz
                ANCAK method bulununca hemen CALISTIRILMAZ
                data turu secilen class'dan
                constructor kullanilan class'a dogru kontrol yapilir
                o method'un en guncel hali calistirilir.
         */

        FAvciKuslar avciKus1 = new FAvciKuslar();
        avciKus1.cogalma(); // Kuslar - yumurtayla cogalir
        avciKus1.beslenme(); // Avci - etle beslenirler
        avciKus1.kanat(); // Kuslar - kanatlari vardir
        avciKus1.omur(); // Hayvan - yasar ve olurler
        avciKus1.gaga(); // Avci - sivri gagalidir
        avciKus1.hareket(); // Avci - Ucarlar
        avciKus1.pence(); // Avci - penceleri vardir
        avciKus1.solunum(); // Kus - Akcigerle solunum yapar

        EKuslar avciKusgiller = new FAvciKuslar();

        avciKusgiller.cogalma(); // Kuslar - yumurtayla cogalir
        avciKusgiller.beslenme(); // Avci - etle beslenirler
        avciKusgiller.kanat(); // Kuslar - kanatlari vardir
        avciKusgiller.omur(); // Hayvan - yasar ve olurler
        avciKusgiller.gaga(); // Avci - sivri gagalidir
        avciKusgiller.hareket(); // Avci - Ucarlar
        // avciKusgiller.pence(); // Kuslar ve Hayvan'da pence yok CTE
        avciKusgiller.solunum(); // Kus - Akcigerle solunum yapar

        DHayvan avciHayvangiller = new FAvciKuslar();
        avciHayvangiller.cogalma(); // Kuslar - yumurtayla cogalir
        avciHayvangiller.beslenme(); // Avci - etle beslenirler
        //avciHayvangiller.kanat(); // Hayvan'da yok CTE
        avciHayvangiller.omur(); // Hayvan - yasar ve olurler
        //avciHayvangiller.gaga(); // Hayvan'da yok CTE
        avciHayvangiller.hareket(); // Avci - Ucarlar
        //avciHayvangiller.pence(); // Hayvan'da yok CTE
        avciHayvangiller.solunum(); // Kus - Akcigerle solunum yapar


        DHayvan hayvan1 = new DHayvan();
        hayvan1.cogalma(); // Hayvan -  cogalir
        hayvan1.beslenme(); // Hayvan - beslenirler
        // hayvan1.kanat(); // Hayvan'da yok CTE
        hayvan1.omur(); // Hayvan - yasar ve olurler
        // hayvan1.gaga(); // Hayvan'da yok CTE
        hayvan1.hareket(); // Hayvan - hareket ederler
        // hayvan1.pence(); // Hayvan'da yok CTE
        hayvan1.solunum(); // Hayvan - solunum yapar

        EKuslar kus1 = new EKuslar();
        kus1.cogalma(); // Kuslar - yumurtayla cogalir
        kus1.beslenme(); // Hayvan - beslenirler
        kus1.kanat(); // Kuslar - kanatlari vardir
        kus1.omur(); // Hayvan - yasar ve olurler
        kus1.gaga(); // Kus - gagalidir
        kus1.hareket(); // hayvan - hareket ederler
        // kus1.pence(); // Kus veya Hayvan'da yok CTE
        kus1.solunum(); // Kus - Akcigerle solunum yapar



        DHayvan kusHayvangiller = new EKuslar();
        kusHayvangiller.cogalma(); // Kuslar - yumurtayla cogalir
        kusHayvangiller.beslenme(); // Hayvan - beslenirler
        //kusHayvangiller.kanat(); // Hayvan'da yok CTE
        kusHayvangiller.omur(); // Hayvan - yasar ve olurler
        //kusHayvangiller.gaga(); // Hayvan'da yok CTE
        kusHayvangiller.hareket(); // hayvan - hareket ederler
        //kusHayvangiller.pence(); // Hayvan'da yok CTE
        kusHayvangiller.solunum(); // Kus - Akcigerle solunum yapar

    }
}

