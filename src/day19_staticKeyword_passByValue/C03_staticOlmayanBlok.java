package day19_staticKeyword_passByValue;

public class C03_staticOlmayanBlok {

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C03_staticOlmayanBlok obj1 = new C03_staticOlmayanBlok();
        C03_staticOlmayanBlok obj2 = new C03_staticOlmayanBlok();
        C03_staticOlmayanBlok obj3 = new C03_staticOlmayanBlok();
    }


    static {
        System.out.println("static blok calisti");

    }


    {
        /*
            static olmayan kod bloklari objelere baglidir
            her obje olusturuldugunda statik olmayan blok tekrar calisir

            static blok ise sadece 1 kere class ilk calismaya basladiginda calisir

            obje olusturuldugunda constructor icinde yapmak istemediginiz
            ama obje icin ihtiyac duydugunuz bir islem varsa
            static olmayan blok kullanilabilir
         */
        System.out.println("static olmayan kod blogu calisti");
    }
}
