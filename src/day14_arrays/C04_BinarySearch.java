package day14_arrays;
import java.util.Arrays;
public class C04_BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,3,6,3,6,7,8,3,4,7,3};
        // sort yapmadan once
//        System.out.println(Arrays.binarySearch(arr, 6)); // arrayin icinde alti var mi?  // 6
//        System.out.println(Arrays.binarySearch(arr, 7)); // arrayin icinde 11 var mi?  // 11
//        System.out.println(Arrays.binarySearch(arr, 3)); // arrayin icinde 3 var mi?  // 1
//        System.out.println(Arrays.binarySearch(arr, 4)); // arrayin icinde 4 var mi?  // -3
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [2, 3, 3, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8]
        System.out.println(Arrays.binarySearch(arr, 6)); // arrayin icinde alti var mi?  // 9
        System.out.println(Arrays.binarySearch(arr, 7)); // arrayin icinde 11 var mi?  // 11
        // var mı yokmu sorusuna cevap veriyor ama birden fazla aynı deger olabilir
        System.out.println(Arrays.binarySearch(arr, 3)); // arrayin icinde 3 var mi?  // 2
        System.out.println(Arrays.binarySearch(arr, 4)); // arrayin icinde 4 var mi?  // 5 //Duzeldi
        // [2, 3, 3, 3, 3, 4, 6, 6, 7, 7, 8]
        // olmayan bir sayi arattigimiz zaman, olsaydi surada olurdu degerini eksi olarak veriyor. elemanlari saymaya
        // birden basliyor.
        System.out.println(Arrays.binarySearch(arr,5));  // -7
        // son rakamdan buyuk bir sayi aradigimizde son rakamdan sonra olurdu cevabi eksi olarak geliyor
        System.out.println(Arrays.binarySearch(arr,10));  // -12
        System.out.println(Arrays.binarySearch(arr,100));  // -12
        System.out.println(Arrays.binarySearch(arr,-3));  // -1
        System.out.println(Arrays.binarySearch(arr,-333));  // -1
    }
}

