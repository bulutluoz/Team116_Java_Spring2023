package day17_constructors;

public class C03_Hastane {

    static String hastaneAdi= "Yildiz Hastanesi";
    static String hastaneTelefonu= "03123454545";

    String personelIsmi= "Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";
    String personelTuru="Personel turu belirtilmedi";

    public int maas(String personelTuru){

        switch (personelTuru){

            case "Doktor" :
                return 5000;

            case "Hemsire" :
                return 3000;

            case "Bashemsire" :
                return 4000;

            default:
                return 1900;
        }
    }
}
