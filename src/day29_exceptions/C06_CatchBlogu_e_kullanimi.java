package day29_exceptions;

public class C06_CatchBlogu_e_kullanimi {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;


        try {

            System.out.println(sayi1/sayi2);

        } catch (Exception e) {
            /*
                burada kullanilan e,
                olusan exception'i atayabilecegimiz bir variable'dir
                Exception e = olusanHata;
                seklinde bir variable olusturulmus ve deger atanmis olur
                catch blogu icerisinde e icin hazirlanmis method'lar kullanilarak
                istedigimiz sekilde hata mesajlari yazdirilabilecegi gibi
                hazir method'lari kullanmayip
                kendi mesajimizi da yazdirabiliriz
             */

            // e.printStackTrace(); // exception'daki tum hata mesajini yazdirir ama yoluna devam eder
            // System.out.println(e.getMessage()); // / by zero
            System.out.println(e.getCause()); // null

        }
    }
}
