package day18_parametreliConstructor_constructorCall;

public class C01_Hastane {

    public C01_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }

    public C01_Hastane(){
        System.out.println("Parametresiz constructor");
    }

    public C01_Hastane(String isim,String adres,String telefon,String tur){
        personelIsmi=isim;
        personelAdresi=adres;
        personelTelefon=telefon;
        personelTuru=tur;
    }


    public String toString() {
        return "C07_Hastane Objesi==> " +
                "personelIsmi:'" + personelIsmi + '\'' +
                ", personelAdresi:'" + personelAdresi + '\'' +
                ", personelTelefon:'" + personelTelefon + '\'' +
                ", personelTuru:'" + personelTuru + '\'';
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
