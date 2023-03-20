package day01_javayaGiris;

public class C02_Assignment {

    public static void main(String[] args) {

        int sayi;

        // Java deger atanmadan
        // bir variable olusturulmasina izin verir
        // ama deger atanmadan kullanmaya izin vermez
        // System.out.println(sayi);

        sayi = 20;

        System.out.println(sayi); // 20

        sayi = sayi + 10 ;

        System.out.println(sayi); // 30

        // sayi + 10 = sayi ;
        // Java'da esitligin sol tarafi variable'dir ve sol tarafta islem olmaz
        // esitligin sag tarafi degerdir, burada islemler olabilir
        // java = gordugunde once esitligin sagini hesaplar
        // sonra sag tarafta buldugu degeri, soldaki variable'a atama yapar

        sayi = 2 * sayi ;

        System.out.println(sayi); // 60


        // int sayi = 50;
        // data turu yukarida tanimlanmisti
        // Java olusturulan bir variable'in data turunun degistirilmesine IZIN VERMEZ
        // onun icin dat6a turu sadece 1 kere yazilabilir


    }


}

    /*
        Java'da bir kodun alti kirmizi cizili ise
        orada Compile Time Error CTE vardir

        eger projenin herhangi bir yerinde CTE varsa
        o projedeki hic bir class calismaz

        Java'da yazdirma islemi yapilirken
        " " arasina yazilan her sey bir metin olarak algilanir
        ve " " ne yazarsaniz oraya yazdiginiz sekilde consolda yazdirilir

        Eger bir variable'in o satirdaki degerini yazdirmak isterseniz
        sout icerisine varible ismini yazmaniz yeterlidir.

     */