package day20_passByValue_immutableClasses;

public class C04_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";

        String s = "Ja";
        String t = "va";
        String str5 = s + t ;
        String str6 = s.concat(t);


        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Java")); // true

        System.out.println("================");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Java"); // true

        /*
            equals() sadece metin degerlerine bakar
            == ise hem metin degerine hem de referanslara bakar
         */

    }
}
