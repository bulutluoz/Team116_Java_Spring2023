package day23_encapsulation_inheritance;

public class C05_EncapsuleClassRunner {
    public static void main(String[] args) {

        C04_EncapsuleClass obj = new C04_EncapsuleClass();


        obj.publicStr = "Java super"; // write
        System.out.println(obj.publicStr); // read


        obj.setPrivateStr("Herseyi dusunmusler"); // write
        System.out.println(obj.getPrivateStr()); // read


        /*
            Bir class uyesini private yapip
            hem getter, hem setter method'u olusturmak ile

            o class uyesini public yapmak arasinda islev acisindan
            BIR FARK YOKTUR

            Bazi developer'lar public yapmak yerine
            private yapip, getter setter olusturmayi tercih ederler
            buradaki temel amac public oldugunda yapilamayan bir islemi yapmak DEGIL
            atama ve okuma islemlerine VURGU YAPMAKTIR
         */

    }
}
