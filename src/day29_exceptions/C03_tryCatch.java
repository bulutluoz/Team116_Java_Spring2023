package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatch {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alin
        // kullanici tamsayi girmezse, hata mesaji verip yeniden sayi isteyin
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        boolean sayiIste= true;
        int sayi1=0;

        while (sayiIste){

            try {

                System.out.println("Lutfen bolunecek tamsayiyi yazin");
                sayi1 = scanner.nextInt();
                sayiIste=false;

            } catch (InputMismatchException e) {
                String temp= scanner.next();
                System.out.println("Tamsayi degeri girmelisiniz");
            }

        }

        sayiIste= true;
        int sayi2=0;

        while (sayiIste){

            try {

                System.out.println("Lutfen bolecek tamsayiyi yazin");
                sayi2 = scanner.nextInt();
                sayiIste=false;

            } catch (InputMismatchException e) {
                String temp= scanner.next();
                System.out.println("Tamsayi degeri girmelisiniz");
            }

        }


        try {
            System.out.println("Iki sayinin bolme sonucu : "  + sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Sayilar sifira bolunemez");
        }





    }
}
