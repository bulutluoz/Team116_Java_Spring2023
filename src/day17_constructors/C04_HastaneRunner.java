package day17_constructors;

public class C04_HastaneRunner {

    public static void main(String[] args) {

        /*
        Biz bir obje olusturdugumuzda java once bu constructor'un varligini teyit eder.
        Constructor varsa istenen objeyi olusturur.
        Obje olusturulunca instance olan butun variable'larin birer kopyalarini olusturur
        ve bu objeye iliskilendirir
        Objeye yeni bir atama yapmadigimiz muddetce
        objenin olusturuldugu class'daki ilk degerleri kullanir.

        obje uzerinden static variable'lara ulasmak istedigimizde
        java once obje'ye gider, o objeye ilisiklendirilen bilgilerde
        istenen variable'i bulamazsa, class seviyesinde static variable'lara ulasir

        static variable'lar class'a baglidir
        ve degistirilirse tum objeler icin degisiklik gecerli olur

         */

        C03_Hastane per1 = new C03_Hastane();

        System.out.println(per1.personelIsmi);
        per1.personelTuru="Doktor";
        System.out.println(per1.maas("Doktor"));



        C03_Hastane per2= new C03_Hastane();
        System.out.println(per2.personelTuru);


        System.out.println(per1.hastaneAdi);
        per2.hastaneAdi="Java Hastanesi";
        System.out.println(per1.hastaneAdi);

    }

}
