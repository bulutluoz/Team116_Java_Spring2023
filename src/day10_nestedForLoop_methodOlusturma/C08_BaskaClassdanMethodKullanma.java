package day10_nestedForLoop_methodOlusturma;

public class C08_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {

        /*
            Java OOP consept'in en buyuk avantaji
            proje icerisinde 1 kere olusturulan method'un
            her yerden rahatlikla kullanilabilmesid

            Baska bir class'da static keyword kullanilarak olusturulan method'lara
            classIsmi.methodismi(parametreler) seklinde ulasabiliriz
         */

        C07_MethodOlusturma.ikiSayiTopla(4,3); // Iki sayinin toplami : 7

        C09_FaktoryelDegeriYazdirma.faktoryelDegeriYazdir(6); // 6! = 720

        C10_AsalsayiSonucuYazdirma.asalSayiMiYazdir(57); // 57 sayisi asal degil

    }
}
