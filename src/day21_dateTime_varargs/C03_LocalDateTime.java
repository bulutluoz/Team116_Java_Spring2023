package day21_dateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts); // 2023-04-25 T 11:04:32.099758

        // tarih ve saati su sekilde yazdirin 25/04/2023 11:04

        System.out.println(ts.getDayOfMonth()+"/"+ts.getMonthValue()+"/"+
                            ts.getYear()+ " " + ts.getHour() + ":" + ts.getMinute()); // 25/4/2023 11:8

        System.out.println(ts.plusHours(100));


    }
}
