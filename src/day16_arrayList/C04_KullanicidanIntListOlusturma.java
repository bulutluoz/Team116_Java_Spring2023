package day16_arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C04_KullanicidanIntListOlusturma {
    // kullanicidan integer list olusturup donduren bir method olusturun
    public static void main(String[] args) {
        System.out.println(kullanicidanSayiAlarakListeOlusturanMethod());
    }
    public static List<Integer> kullanicidanSayiAlarakListeOlusturanMethod() {
        Scanner scan = new Scanner(System.in);
        // kullanicdan sayilar loop icinde alıncak, loop sayisi bilinmediginden while
        // kullanici sifira basinca loop duracak
        int girilenSayi = 4;
        List<Integer> sayilar = new ArrayList<>();
        // girilen sayi "0"a esit olmadigi surece loop devam etmeli
        while (girilenSayi != 0) {
            System.out.println("Lütfen listeye eklemek icin bir sayi giriniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                sayilar.add(girilenSayi);
            }
        }
        return sayilar;
    }
}

