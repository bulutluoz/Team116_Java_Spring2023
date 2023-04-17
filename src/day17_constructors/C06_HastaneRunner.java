package day17_constructors;

public class C06_HastaneRunner {

    public static void main(String[] args) {

        C05_Hastane per1 = new C05_Hastane();

        System.out.println(per1.personelIsmi); // Isim belirtilmedi
        System.out.println(per1.personelTelefon); // Telefon belirtilmedi
        System.out.println(per1.personelAdresi); // Adres belirtilmedi
        System.out.println(per1.personelTuru); // Personel turu belirtilmedi
        System.out.println(per1.maas()); // 1900


        per1.personelIsmi="Adem";
        per1.personelAdresi="Cankaya";
        per1.personelTelefon= "5553242132";
        per1.personelTuru="Doktor";

        System.out.println(per1.personelIsmi); // Adem
        System.out.println(per1.personelTelefon); // 5553242132
        System.out.println(per1.personelAdresi); // Cankaya
        System.out.println(per1.personelTuru); // Doktor
        System.out.println(per1.maas()); // 5000

    }
}
