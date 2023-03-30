package day08_stringManipulations;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {

        /*
        bir yazının (str), bir yazı parçacılığı ile başlayıp başlamadığını test ederek, true veya false
        cevabını verir (döndürür)
         */

        String str = "Java çok eğlenceli";

        System.out.println(str.startsWith("java")); // false
        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.startsWith(str)); //true // her yazı kendisiyle başlar

        System.out.println(str.startsWith("")); // true // herşeyin başında hiçbirşey vardır

        System.out.println("===========================");

        /*
        endsWith() methodu, istenilen bir yazının, belli bir yazı parçacığı ile bitip bitmediğini kontrol eder
         */

        System.out.println(str.endsWith("a")); // false
        System.out.println(str.endsWith("eğlenceli")); // true
        System.out.println(str.endsWith("celi")); // true
        System.out.println(str.endsWith("Java çok eğlenceli")); //true
        System.out.println(str.length());  // 18

        System.out.println(str.substring(str.length() - 3));

        System.out.println(str.endsWith(str.substring(str.length() - 3))); // true


    }
}
