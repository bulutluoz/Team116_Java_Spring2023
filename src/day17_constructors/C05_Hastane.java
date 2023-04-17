package day17_constructors;

public class C05_Hastane {
    /*
        Bir class'da gorunurde constructor yoksa
        default constructor vardir

        default constructor parametresiz bir constructor'dir
        ve body'sinde hic bir kod bulunmaz

        default constructor asagida verilen constructor'a benzer
        C05_Hastane (){

        }

        ancak bir constructor gorunur ise
        artik ona default constructor demeyiz
        parametresi yoksa ona parametresiz constructor diyebiliriz

        biz herhangi bir constructor olusturursak
        java default constructor'i siler
        yani bir class'da gorunur bir constructor varsa
        DEFAULT CONSTRUCTOR yoktur, diyebiliriz



     */

    C05_Hastane (){
        System.out.println("parametresiz constructor calisti");
    }

    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "03123454545";

    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas() {

        switch (personelTuru) {

            case "Doktor":
                return 5000;

            case "Hemsire":
                return 3000;

            case "Bashemsire":
                return 4000;

            default:
                return 1900;
        }
    }
}
