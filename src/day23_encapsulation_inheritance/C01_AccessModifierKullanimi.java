package day23_encapsulation_inheritance;

import day22_stringBuilder_accessModifier.C05_accessModifier;

import java.util.Collections;

public class C01_AccessModifierKullanimi extends C05_accessModifier{

    public static void main(String[] args) {

        // baska package'daki bir class'dan class uyelerinin
        // sadece public olanlari kullanabiliriz
        // eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        // parent-child iliskisi varsa class uyelerine erisim mumkundur

        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier.publicStaticMethod();

        C05_accessModifier.protectedStaticSayi=10;
        C05_accessModifier.publicStaticSayi=25;

        System.out.println(C05_accessModifier.publicStaticSayi); // 25
        System.out.println(C05_accessModifier.protectedStaticSayi); // 10



        /*
            Access modifier ile erisimi duzenlenen bir class uyesine
            baska class'dan erisebilirsek
            hem deger atamasi yapabilir, hem de o class uyesinin degerini yazdirabiliriz
         */

    }
}
