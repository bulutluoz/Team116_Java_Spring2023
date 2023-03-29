package day07_switchStatements_StringManipulations;

public class C08_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");
        // Normalde non-primitive data turundeki objeler, new keyword'u ile olusturulur
        // String'i de new keyword'u ile olusturabiliriz
        // ancak Java bizim isimizi kolaylastirmak icin
        // String'e direk deger atanmasini da saglamistir.

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str4.equals(str5)); // false
        System.out.println(str2.equals(str6)); // true

        /*
            equals() verilen iki String'in metin olarak ayni olup olmadigina bakar
            case sensitive'dir dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir
         */

        // String icin == kullanilamaz mi ?
        System.out.println(str1 == str2); // true Java == Java
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str6); // false Java == Java

        /*
            equals method'u sadece degerlere bakar
            metin ayni ise sonuc true, metin farkli ise sonuc false olur

            == ise hem metin degerine hem de referansa bakar
            ilerde anlatacagimiz uzere java bazen ayni referanslari
            farkli objelere de verir
            bu konuyu ilerde detaylandiracagiz

            SIMDILIK
            iki String'in metin olarak ayni oldugunu kontrol etmek isterseniz
            equals method'u kullanmalisiniz, == kullanmamalisiniz

         */










    }
}
