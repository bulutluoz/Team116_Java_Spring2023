package day22_stringBuilder_accessModifier;

public class C04_AccessModifiers {

    public String marka;
    String model;
    /*
        Eger bir method'da veya class level'daki bir variable'da
        access modifier gorunmuyorsa
        o class uyesi icin default access modifier gecerlidir


        default keyword
        1- switch statement'da default value
        2- class level'da olusturulan variable'lar icin default deger
        3- default constructor
        4- default access modifier


        Access modifier ve static keyword birlikte degerlendirilmelidir
        - class icerisinde dusundugumuzde static keyword bir method icerisinde,
          herjangi bir class uyesinin kullanilabilir olup olmadigini belirler
        - baska class'dan kullanimda ise static keyword erisim yontemini belirler
          static class uyeleri classIsmi.staticUyeIsmi seklinde kullanilirken
          static olmayan class uyeleri icin obje olusturulmasi sarttir
     */


    public static void method1(){

    }

    public void method2(){

    }

    void method3(){

    }
}
