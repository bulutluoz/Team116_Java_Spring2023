package day03_dataCasting_Increment;

public class C02_DataCasting {

    public static void main(String[] args) {

        int in1 = 10;
        int in2 = 130;
        int in3 = 520;
        int in4 = 1000000;

        byte byt = (byte) in1 ;
        System.out.println("10 byte olarak : " + byt);// 10

        byt = (byte) in2;
        System.out.println("130 byte olarak : " + byt);//-126

        byt = (byte)in3;
        System.out.println("520 byte olarak : " + byt);// 8

        byt = (byte)in4;
        System.out.println("1 milyon byte olarak : " + byt); // 64


        double dbl1 = 99.99;
        double dbl2 = 14.01;
        double dbl3 = 140.32;

        int sayi = (int)dbl1;
        System.out.println("99.99 int olarak : " + sayi); // 99

        sayi = (int) dbl2;
        System.out.println("14.01 int olarak : " + sayi); // 14

        sayi = (byte)dbl3;

        System.out.println("140.32 int olarak : " + sayi); // -116
        // 2 kere casting var
        // 1- double sayiyi once explicit narrowing ile byte'a ceviriyor // esitligin saginda
        // 2- byte'a cevrilen sayiyi autowidening ile int'a cast ediyor  // assignment ile


    }
}
