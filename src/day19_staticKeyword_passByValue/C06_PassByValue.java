package day19_staticKeyword_passByValue;


public class C06_PassByValue {

    public static void main(String[] args) {
        double fiyat = 200;

        // verilen fiyattan %10 indirim yapip
        // yeni fiyati bize donduren bir method olusturun

        // sadece indirimli fiyati yazdirmak istersem
        System.out.println(indirimYap10(fiyat));  // 180

        System.out.println("indirimli fiyat yazdirdiktan sonra : " + fiyat); // 200.0

        // indirimli fiyati kalici hale getirmek istersem
        // main method icinde atama yapmaliyim
        fiyat = indirimYap10(fiyat);
        System.out.println("indirimli fiyat kaydettikten sonra : " + fiyat); // 200.0

        System.out.println(indirimYap10(500));

    }

    public static double indirimYap10(double fiyat){

        fiyat = fiyat * 90 / 100 ;

        return fiyat;
    }


}
