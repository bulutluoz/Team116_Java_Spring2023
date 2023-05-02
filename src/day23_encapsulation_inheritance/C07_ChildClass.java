package day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_Parent{

    public static void main(String[] args) {
        C04_EncapsuleClass objBaskaClass= new C04_EncapsuleClass();
        System.out.println(objBaskaClass.publicStr);


        C07_ChildClass objKendiClass= new C07_ChildClass();
        System.out.println(objKendiClass.strPublic); // Parent class strPublic
        System.out.println(objKendiClass.strDefault); // Parent class strDefault
        System.out.println(objKendiClass.strProtected); // Parent class strProtected
        // System.out.println(objKendiClass.strPrivate);

        objKendiClass.strProtected="Child da atanan deger";

        objKendiClass.protectedMethod(); // Parent class protected method
        objKendiClass.defaultMethod(); // Parent class default method
        objKendiClass.publicMethod(); // child class public method
    }


    public void publicMethod(){
        System.out.println("child class public method");
    }

}

/*
    Java'da child class'lar parent edinir
    Eger bir class'daki tum ozellikllere otomatik olarak sahip olmak (miras edinmek) isterseniz
    o class'i extends keyword kullanarak PARENT EDINEBILIRSINIZ


    Baska bir class'dan obje olusturarak o class'daki class uyelerini kullanmak
    INHERITANCE degildir.

    Bir child class access modifier gozununde bulundurularak
    parent class'daki tum ozelliklere otomatik olarak sahip olur

        parent class'daki
        - private class uyeleri : inherit edilemez
        - default class uyeleri : ancak ayni package icinde isek inherit edilebilir
        - protected class uyeleri : her yerden inherit edebilir
        - public class uyeleri : her yerden inherit edilir.
                                 public olanlar sadece child class'lardan degil
                                 tum class'lardan kullanilabilir
        parent-child iliskisi olan class'larda kullanilacak
        en ideal access modifier PROTECTED'dir.

        Parent-Child iliskisi 2 durumda kullanilir
        1- Eger bir projeyi sifirdan olusturuyorsaniz
           Tasarim asamasinda parent-child class'lari dusunup
           uygulamayi ona gore gelistirebiliriz
           boylece reusability ve kolay maintenance saglanir
        2- Sonradan bir class olusturuldugunda
           daha onceden olusturulmus bir class'daki
           tum ozelliklere sahip olmasi istenirse
           o class'a child yapabiliriz.


        - Bir child class parent cclass'daki tum ozelliklere otomatik olarak sahip olur
        - Isterse parent class'daki ozelliklerden bazilarini kendisine uyarlar
        - Isterse de parent classlarinda olmayan yeni ozellikler ekleyebilir

 */