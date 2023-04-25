package day21_dateTime_varargs;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        // calistigi anda sistemde var olan zamani alip saat variable'na kaydeder
        // kronometre gibi calismaz sadece 9.satirin calistigi zamani kaydeder
        // eger farkli satirlarin calisma zamanlarini gormek istersek
        // o satirlarda da yeni localTime objeleri olusturmaliyiz

        System.out.println(saat); // 10:04:40.576670
        // zamani saat,dakika,saniye ve nano saniye olarak kaydeder

        System.out.println(saat.getNano());
        System.out.println(saat.getSecond());
        // get() lari bize saatin istedigimiz bolumunu getirir

        System.out.println(saat.withHour(14)); // 14:08:05.188338
        System.out.println(saat.withHour(11).withSecond(0).withNano(0)); // 11:10
        // with() lari saatin istedigimiz bolumunu istedigimiz yeni bir deger ile degistirerek zamani verir

        System.out.println(saat.plusHours(100)); // 14:12:47.784817
        System.out.println(saat.plusMinutes(10000)); // 08:53:30.314276
        System.out.println(saat.minusHours(37).minusMinutes(22)); // 20:52:19.679568
        // plus() ve minus() saati istedigimiz miktarda ileri veya geri goturur


        // istedigimiz saat,dakika, saniye ve nano saniye ile zaman variable'i olusturmak istersek

        LocalTime istenenZaman= LocalTime.of(12,23,15,10);
        System.out.println(istenenZaman); // 12:23:15.000000010


        // iki zamani birbiriyle karsilastirmak istersek
        System.out.println(istenenZaman.isAfter(saat));// true
        System.out.println(istenenZaman.isBefore(saat)); // false

        System.out.println(saat.compareTo(istenenZaman)); // -1
        System.out.println(istenenZaman.compareTo(saat)); // 1
        // iki zamani karsilastirir, kucukse negatif, buyukse pozitif bilgi doner



    }
}
