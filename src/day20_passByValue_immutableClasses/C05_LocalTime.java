package day20_passByValue_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {

    public static void main(String[] args) {

        /*
        java'da zaman ve tarih ile ilgili pekcok class vardir
        biz 3 class gorecegiz
        LocalTime class'i saat ile ilgili method'lar icerir


         */

        LocalTime saatBaslangic = LocalTime.now();

        // LocalTime.now() bulundugu satir calistiginda bilgisayarin saatini alip kaydeder
        // saat variable'i canli bir kronometre degil,
        // bulundugu satirin calistigi zamani kaydeden bir variable'dir

        System.out.println(saatBaslangic);

        int toplam = 0;

        for (int i = 0; i <= 50000 ; i++) {
            toplam += i;
        }

        System.out.println(toplam);

        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis);


        LocalTime saat = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(saat);
        
        LocalTime saat2 = LocalTime.of(11,20,25);
        System.out.println(saat2); // 11:20:25

        LocalTime saat3 = LocalTime.ofSecondOfDay(15000);
        System.out.println(saat3);    // 04:10



    }
}
