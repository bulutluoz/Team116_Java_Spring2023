package day28_Interface;

import day27_pollymorphism_abstractClasses.C04_Toyota;

public class C03_ChildOf_I01_I02 extends C04_Toyota implements I01_Interface,I02_Interface{
    /*
    Bir class birden fazla class'i inherit EDEMEZ
    ANCAK
    bir child class 1 class'i inherit ederken,
    ayni zamanda baska Interface(ler)i de inherit edebilir

    Birden fazla Interface'i inherit etmek istedigimizde
    dikkat etmemiz gerek konu :

    Eger inherit etmek istedigimiz farkli Interface'lerde
    ayni isimde AMA farkli returnType'a sahip method varsa
    iki Interface'i birden IMPLEMENT EDEMEYIZ

    Interface'lerde olusturulan variable'lar public static ve final'dir
    yani her yerden ulasilabilir ama DEGISTIRILEMEZ

    eger bir child class'in implement ettigi farkli interface'lerde
    ayni isimde variable varsa
    static yontem kullanilarak interfaceIsmi.VariableIsmi ile kullanilir
 */
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI); // 20
        System.out.println(I02_Interface.SAYI); // 30
        System.out.println(DERS);


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }

}
