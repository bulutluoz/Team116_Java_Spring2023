package day03_dataCasting_Increment;

public class C01_DataCasting {

    public static void main(String[] args) {

        int in1 = 10;
        short shrt = 12;
        byte byt = 15;
        long lng = 20;

        float flt = 1.2f;
        double dbl = 3.2;

        boolean bl = true;

        char chr = 'a';

        String str= "Java Candir";


        /*
            bir data turundeki variable'a baska data turunden deger atanabilir mi ?
           bazi data turleri deger olarak baska data turundeki degerleri ASLA kabul etmez

           Sayisal deger alan primitive data turlerinde ise
           daha kapsamli olan data turundeki variable,
           daha dar kapsamli data turundeki degeri OTOMATIK olarak kabul eder

         */


        // chr = byt;
        // chr = str;
        // chr = flt;


        // bl = in1;
        // bl = "true";

        // str = bl;
        // str = chr;
        // str = shrt;


        in1 = shrt;
        in1 = byt;
        // in1 = lng;
        // in1 = dbl;
        // in1 = flt;

        lng = byt;
        lng = shrt;
        lng = in1;
        // lng = flt;
        // lng = dbl;


        dbl = byt;
        dbl = shrt;
        dbl = in1;
        dbl = lng;
        dbl = flt;

        // byt = shrt;
        // byt = in1;
        // byt = lng;
        // byt = flt;
        // byt = dbl;



    }
}
