package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alip
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunecek tamsayiyi yazin");

        int sayi1 = 0;
        try {
            sayi1 = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("tamsayi degeri girmelisiniz");
        }

        System.out.println("Lutfen bolecek tamsayiyi yazin");

        int sayi2 = 0;
        try {
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("tamsayi degeri girmelisiniz");
        }

        /*
            Kodumuzu yazarken
            bir exception olusma ihtimali goruyorsak
            sorun cikmasi muhtemel kodumuzu
            try-catch ile cevreleriz

            try-catch temel 3 bolumden olusur
            1- try blogu : exception olusmasi muhtemel kodlarin konuldugu bolum
            2- catch (Exception e) : catch keyword ve beklenen exception turunu yazdigim bolum
            3- catch blogu : ongordugumuz exception olustugunda
                             Calismasini istedigimiz kodlar

            Kullanicinin yapmasi muhtemel hatalari
            tamamiyla ayiklamak icin
            genis kapsamli dusunup
            tum ihtimalleri cozmek gerekir.

         */


        try {
            System.out.println("Iki sayinin bolme sonucu : "  + sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Sayilar sifira bolunemez");
        }


    }
}
