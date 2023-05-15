package day29_exceptions;


import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // Kullanicidan iki tam sayi alip
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin

        /*
            kodlarimizi yazarken
            kullanici tarafindan yapilabilecek hatalari ONGOREBILIYORSAK
            Java'ya ongorebildigimiz hata ihtimalleri icin
            yapmasi gerekenleri soyleyebiliriz

            ornegin asagidaki bolme isleminde kullanicin sifir girme ihtimalini
            if else ile handle edebiliriz

            Ancak tum sorunlari if else ile cozmek mumkun degildir
            ornegin istenen data turune uygun olmayan bir input girilmesini
            if-else ile cozemeyiz

            Java ONGORULEBILIR hatalari cozebilmemiz icin
            exception interface'ini olusturmustur.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunecek tamsayiyi yazin");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi yazin");
        int sayi2 = scanner.nextInt();


        if (sayi2 == 0){
            System.out.println("Sayilar sifira bolunemez");
        }else {
            System.out.println("Iki sayinin bolme sonucu : "  + sayi1/sayi2);
        }
    }
}
