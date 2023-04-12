package day15_multiDimensionalArrays;

import java.util.Arrays;

public class C02_TumElementlereUlasma {
    public static void main(String[] args) {

        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        /*
        tek katli array'de
        for-loop olusturuyorduk
        arr[i] bize tum elementleri getiriyordu
        MDA olunca kat sayisinca ic ice loop olusturmak gerekir
        bizim sorumuzda ic ice 2 loop olusturacagiz
        arr[i][j] bize tum elementleri getirecek
         */

        // tum elementleri aralarinda bir bosluk birakarak yanyana yazdiralim

        for (int i = 0; i < arr.length ; i++) { // outer loop'u kontrol edecek arr[0], arr[1]...
            for (int j = 0; j <arr[i].length ; j++) { // inner array'leri kontrol edecek

                System.out.print(arr[i][j] + " ");

            }
        }
        System.out.println("");

        // tum elementlerin toplamini yazdirin
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];
            }
        }
        System.out.println("Tum elementlerin toplami : " + toplam);

        // MDA'deki en buyuk elementi yazdirin
        int enBuyukSayi=arr[0][0];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]>enBuyukSayi){
                    enBuyukSayi = arr[i][j];
                }
            }
        }

        System.out.println("Array'deki en buyuk element : " + enBuyukSayi );

        // MDA'daki cift sayilari yanyana yazdirin

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] %2==0){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
