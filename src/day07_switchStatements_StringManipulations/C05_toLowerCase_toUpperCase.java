package day07_switchStatements_StringManipulations;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candir.";

        // tumunu buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR.

        System.out.println(str); // Java Candir.

        // str'i buyuk harfle yazilmis haline donusturun

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR.

        System.out.println(str.toLowerCase()); // java candir.
        // str'i Turkce karakterleri dikkate alarak kucuk harfe cevirin

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // java candır.

        String str2 = "Kimse beni aramıyor.";
        System.out.println(str2.toUpperCase()); // KIMSE BENI ARAMIYOR.

        // Turkce karakterlere uygun olarak buyuk haliyle yazdirin

        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr"))); // KİMSE BENİ ARAMIYOR.


    }
}
