package day19_staticKeyword_passByValue;

import java.util.Arrays;

public class C08_PassByValue {

    public static void main(String[] args) {

        int[] arr = {3,5,7};

        // verilen array'e 4.bir element olarak
        // 10 ekleyip, o halini eski array'e kaydedip yazdiran bir method olusturun

        elemanEkle(arr); // [3, 5, 7, 10]

        System.out.println("method call'dan sonra arr : " + Arrays.toString(arr)); // [3, 5, 7]

        /*
            Birden fazla eleman barindiran
            array, list gibi java objelerinde
            java method'a yollarken
         */

    }

    public static void elemanEkle(int[] arr){

        int[] yeniArr= new int[4];

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }

        yeniArr[yeniArr.length-1] = 10;

        arr= yeniArr;

        System.out.println(Arrays.toString(arr));

    }
}
