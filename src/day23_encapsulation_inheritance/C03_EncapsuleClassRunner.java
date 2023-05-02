package day23_encapsulation_inheritance;

public class C03_EncapsuleClassRunner {

    public static void main(String[] args) {
        /*
    Encapsulation'in temel amaci
    read ve write yetkilerini ayirmak
    ve istedigimiz class uyesine read, istedigimiz class uyesine write
    yetkisi verebilmektir

    access modifier'i default, protected veya public olanlarda
    read/write yetkilerini ayirmamiz mumkun degil.

    access modifier'i private olan class uyelerine ise
    hic ulasamiyoruz
    bunu firsata cevirelim
    normal yollarla private bir class uyesine erisilemez
    ama o class uyesine erisebilecek
    ve yetkisi sinirli olan method'lar olusturabiliriz

 */

        C02_EncapsuleClass obj = new C02_EncapsuleClass();
        obj.strDefault="Default";
        System.out.println(obj.strProtected);

        System.out.println(obj.getToplamSatisTutari()); // 0

        obj.setSatisTutari(100);
        obj.setSatisTutari(300);
        obj.setSatisTutari(200);

        System.out.println(obj.getToplamSatisTutari()); // 600


    }

}
