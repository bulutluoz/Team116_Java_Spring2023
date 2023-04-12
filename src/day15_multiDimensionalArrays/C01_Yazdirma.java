package day15_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Yazdirma {

    public static void main(String[] args) {
        /*
            MDA'de yazdirma islemi yaparken
            yazdirmak istedigimizin ne olduguna bakmamiz gerekir
            - element ise direk yazdirabiliriz
            - tek katli bir array ise Arrays.toString() kullanabiliriz
            - MDA ise Arrays.deepToString() kullanmaliyiz
         */

        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        System.out.println(arr[0][0]); // 1
        // System.out.println(arr[3][2]); // ArrayIndexOutOfBoundsException

        System.out.println(arr.length); // 4

        System.out.println(arr[2].length); // 4

        System.out.println(arr[3].length);// 1

        // arr[2][1].length   bir element oldugu icin length'i olmaz

        System.out.println(arr[2]); // [I@2752f6e2
        System.out.println(Arrays.toString(arr[2])); // [2, 8, 1, 2]


        System.out.println(arr); //  [[I@e580929

        System.out.println(Arrays.toString(arr)); // [[I@1cd072a9, [I@7c75222b, [I@2752f6e2, [I@4c203ea1]

        System.out.println(Arrays.deepToString(arr)); // [[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]
    }
}
