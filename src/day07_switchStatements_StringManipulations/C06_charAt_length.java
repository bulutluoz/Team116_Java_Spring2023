package day07_switchStatements_StringManipulations;

public class C06_charAt_length {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";

        System.out.println(str.charAt(5)); // g

        System.out.println(str.charAt(29)); // r


        // System.out.println(str.charAt(35)); // StringIndexOutOfBoundsException
        // System.out.println(str.charAt(30)); // StringIndexOutOfBoundsException


        // str'da toplam kac karakter var ?

        System.out.println(str.length()); // 30

        // son harfi yazdirin

        int uzunluk = str.length();

        System.out.println(str.charAt(uzunluk - 1));

        // son harften bir onceki harfi yazdir, sondan ikinci harfi

        System.out.println(str.charAt(uzunluk-2));


        // sondan ucuncu harfi yazdirin

        System.out.println(str.charAt(str.length() - 3));


    }
}
