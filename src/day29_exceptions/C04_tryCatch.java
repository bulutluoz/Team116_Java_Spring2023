package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {

    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere tamsayi alin
        // kullanici tamsayi girmezse hata mesaji verip yeniden tamsayi isteyin
        // kullanici islemi bitirmek icin Q veya q'ya basacaktir
        // kullanici islemi bitirdiginde
        // kac tane gecerli sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin


        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        boolean sayiIste= true;
        String tercih = "";

        Scanner scanner = new Scanner(System.in);

        while (sayiIste){

            System.out.println("Toplanmak uzere tamsayi giriniz\nBitirmek icin Q'ya basiniz");

            try { // normal giris icin calisacak kodlar
                sayi = scanner.nextInt();
                toplam += sayi;
                sayac++;

            } catch (InputMismatchException e) { // exception durumunda calisacak kodlar
                tercih = scanner.next();
                // kullanici yanlis giris yaptiginda veya q'ya bastiginda burasi calisacak
                if (tercih.equalsIgnoreCase("q")){
                    break;
                }else{
                    System.out.println("Toplanmak icin TAMSAYI yazmalisiniz");
                }
            }

        }

        System.out.println("Toplam "+ sayac+" adet sayi girdiniz. Toplamlari : " + toplam);

    }
}
