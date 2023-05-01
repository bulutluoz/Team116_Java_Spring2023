package day22_stringBuilder_accessModifier;

public class C06_AccessModifierKullanim {

    public static void main(String[] args) {
        // baska class'daki static class uyelerinden
        // private olmayanlara direk class ismi ile ulasabiliriz
        System.out.println(C05_accessModifier.defaultStaticSayi);
        C05_accessModifier.defaultStaticMethod();

        // ayni package icinde baska class'daki static olmayan class uyelerinden
        // private olanlar haric tamamina obje ile erisebiliriz

        C05_accessModifier obj = new C05_accessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();
    }


    void baskaClassdanKullanimMethodu(){

        System.out.println(C05_accessModifier.publicStaticSayi);

        C05_accessModifier obj = new C05_accessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();

    }
}
