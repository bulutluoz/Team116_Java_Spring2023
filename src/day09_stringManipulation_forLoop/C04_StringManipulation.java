package day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {
        //Soru 6 :  Kullanicidan alinan bir String alin,
        //          String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //          String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        if (metin.length()%2==0){ // uzunluk ciftse

            metin = metin.substring(0,metin.length()/2) +
                    ":)" +
                    metin.substring(metin.length()/2);

        }else{ // uzunluk tek sayi ise

           metin= metin.substring(0,metin.length()/2) + ":("+ metin.substring(1+metin.length()/2);

        }

        System.out.println(metin);
    }
}
