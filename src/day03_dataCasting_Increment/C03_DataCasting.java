package day03_dataCasting_Increment;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        char ch1 = 'a';
        char ch2 = 'b';

        System.out.println(ch1 + ch2); // 195

        // char data turundeki variable'lar
        // matematiksel islemlerde kullanilirsa
        // ascii tablosundaki degerleri ile isleme girerler

        // kullanicidan bir karakter alin
        // ascii tablosuna gore o karakterden sonraki 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChr = scanner.next().charAt(0);

        System.out.println("girilen karakterden sonraki 3 karakter : "
                            + (char)(girilenChr+1) + ", " + (char)(girilenChr+2) + ", "
                            + (char)(girilenChr+3) );



    }
}
