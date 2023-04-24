package day20_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("Z");

        System.out.println(harfler); // [A, K, Z]
        System.out.println("Method call'dan donen list : "+method1(harfler));
        System.out.println("method call'dan sonra list : " + harfler);

        System.out.println("Method2 call'dan donen list : " + method2(harfler));
        System.out.println("method2 call'dan sonra list : " + harfler);

    }


    public static List<String> method1(List<String> harfler){

        harfler.set(0,"T");
        harfler.set(1,"C");
        System.out.println("Method1 icinde list : " + harfler);

        return harfler;
    }


    public static List<String> method2(List<String> harfler){

        harfler= new ArrayList<>();
        harfler.add("P");
        System.out.println("Method 2 icinde harfler listesi : " + harfler);

        return harfler;

    }
}
