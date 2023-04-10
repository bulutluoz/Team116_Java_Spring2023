package day13_arrays;

import java.util.Arrays;

public class C02_TumElementlereErisim {

    public static void main(String[] args) {
        /*
            Bir array'i yazdirmak ile elementlerini yazdirmak farklidir
            bir array'i yazdirmak istersek Arrays.toString() ile yazdiririz
            standart olarak iki tarafinda koseli parantez olur
            aralarinda da ,space bulunur

            Elementleri yazdirmak istedigimizde ise loop kullaniriz
            ve nasil yazdiracagimiz bize bagli olur

         */

        int[] arr = {2,4,6,8,1,3,8,2};

        // bu array'i yazdirin

        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8, 1, 3, 8, 2]

        // array'in tum elementlerini yan yana aralarinda - olacak sekilde yazdirin

        System.out.print(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]);

        System.out.println("");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.print(arr[arr.length-1]);
    }
}
