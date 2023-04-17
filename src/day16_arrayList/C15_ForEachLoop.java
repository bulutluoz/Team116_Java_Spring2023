package day16_arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C15_ForEachLoop {
    public static void main(String[] args) {
        /*
        Stringlerden olusan bir liste icindeki kelimlerden a harfi iceren kelmeleri yazdirin
         */
//         daha onceden hazirladigimiz kullanici liste olusturma methodu ile listeyi olusturuyoruz
        List<String> liste = C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();
        // manuel list olusturabiliriz
//        List<String> liste = new ArrayList<>();
//        liste.add("ahmet");
//        liste.add("hasan");
//        liste.add("veli");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aradiginiz harfi giriniz");
        String arananHarf = scan.next();
        // ahmet hasan veli
        // for each loop ile elemanlara teker teker ulasma
        for (String each : liste
        ) {
            if (each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
