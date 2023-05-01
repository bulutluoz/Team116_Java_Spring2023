package day23_encapsulation_inheritance;

import day22_stringBuilder_accessModifier.C05_accessModifier;

public class C01_AccessModifierKullanimi {

    public static void main(String[] args) {

        // baska package'daki bir class'dan class uyelerinin
        // sadece public olanlari kullanabiliriz
        // eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        // parent-child iliskisi varsa class uyelerine erisim mumkundur

        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier.publicStaticMethod();
    }
}
