package day27_pollymorphism_abstractClasses;

public class C05_Nissan extends C03_Araba{

    /*
        Abstract class'lar yokken class'larimiza ozel bir isim vermemistik
        Ama abstract class'lar devreye girince
        class turunu belirtmek icin abstract olmayan class'lara CONCRETE CLASS denir

        bugune kadar bizim olusturdugumuz tum class'lar concrete class idi
        Concrete class/method'lara concrete yazilmaz
        sadece class/method'dan bahsedilirken
        abstract olmadigini vurgulamak icin concrete class/method deriz
     */

    // abstract void  deneme(); kullanilamaz


    @Override
    void teker() {
        System.out.println("Nissan araclar lassa kullanir");
    }

    @Override
    void motor() {
        System.out.println("Nissan araclar renault motor kullanir");
    }

    @Override
    void gosterge() {
        System.out.println("Nissan araclarda 20 tane gosterge vardir");
    }

    public static void main(String[] args) {

        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge(); // Nissan araclarda 20 tane gosterge vardir
        nissan1.guvenlik(); // parent - Arabalarin guvenlik onlemleri olsa iyi olur
        nissan1.klima(); // parent - Arabalarin klimalari olabilir
        nissan1.motor(); // Nissan araclar renault motor kullanir
        nissan1.teker(); // Nissan araclar lassa kullanir

        C03_Araba nissan2 = new C05_Nissan();
        nissan2.gosterge(); // Nissan araclarda 20 tane gosterge vardir
        nissan2.guvenlik(); // parent - Arabalarin guvenlik onlemleri olsa iyi olur
        nissan2.klima(); // parent - Arabalarin klimalari olabilir
        nissan2.motor(); // Nissan araclar renault motor kullanir
        nissan2.teker(); // Nissan araclar lassa kullanir
    }


}
