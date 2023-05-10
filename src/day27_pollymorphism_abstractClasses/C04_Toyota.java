package day27_pollymorphism_abstractClasses;

public class C04_Toyota extends C03_Araba{

    public static void main(String[] args) {
        /*
            Satisa cikan tum araclar icin somut degerler atanmali
            child class'lar parent class'daki TUM METHOD'LARI OVERRIDE ETMEK ZORUNDA olsun

            Normal parent child iliskisinde MECBURIYET yoktur
            Child class isterse OVERRIDE eder, istemezse etmez

            ABSTRACTION'in temel amaci
            child class'larin MUTLAKA KENDISINE UYARLAMASI GEREKEN method'larin
            override edilmesini SAGLAMAKTIR

            Bir class abstract yapilip
            icerisine abstract method'lar konursa
            o class'i parent edinen
            tum child class'lar
            parent class'daki abstract method'lari OVERRIDE etmelidir
            aksi durumda CTE olusur

         */

        C04_Toyota arac1 = new C04_Toyota();
        arac1.teker(); // Toyota araclar pirelli teker kullanir
        arac1.klima(); // Arabalarin klimalari olabilir
        arac1.motor(); // toyota araclar cevreci motor kullanir

    }

    @Override
    void teker() {
        System.out.println("Toyota araclar pirelli teker kullanir");
    }

    @Override
    void motor() {
        System.out.println("toyota araclar cevreci motor kullanir");
    }

    @Override
    void gosterge() {
        System.out.println("Toyota araclarda tum gostergeler vardir");
    }
}
