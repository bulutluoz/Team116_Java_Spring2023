package day05_ifElseStatements;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz");

        char ilkHarf= scanner.next().toUpperCase().charAt(0);

        if (ilkHarf=='o' || ilkHarf == 'O') System.out.println("Ocak");
        if (ilkHarf=='S') System.out.println("Subat");
        if (ilkHarf=='M') System.out.println("Mart veya Mayis");
        if (ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='H') System.out.println("Haziran");
        if (ilkHarf=='T') System.out.println("Temmuz");
        if (ilkHarf=='A') System.out.println("Agustos veya Aralik");
        if (ilkHarf=='E') System.out.println("Eylul veya Ekim");
        if (ilkHarf=='K') System.out.println("Kasim");





    }
}
