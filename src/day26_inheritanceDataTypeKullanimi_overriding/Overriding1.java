package day26_inheritanceDataTypeKullanimi_overriding;

public class Overriding1 {
    /*
        Overriding, child class'da olusturulan bir method'un
        parent class'daki ayni isim ve signature'a sahip olan
        method'u gecersiz kilmasidir.

        return type signature'a dahil degildir
        yani return type'larin ayni olmasi sart degildir
        ancak return type'lar icin ozel bir kural vardir

        access modifier da signature'a dahil degildir
        yani access modifier'larin ayni olmasi sart degildir
        ancak buna da ozel bir kural vardir
     */

     void method1(){
        System.out.println("Overriding1 method1");
    }

    Object method2(){
        System.out.println("Overriding1 method2");
        return 5;
    }
}
