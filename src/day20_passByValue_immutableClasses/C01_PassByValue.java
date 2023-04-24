package day20_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        int sayi = 20;

        sayi= method2(sayi);

        System.out.println("Method2 call sonrasinda sayi : " + sayi);

        System.out.println("Method call sonucu : "+method1(sayi));

        System.out.println("Method call sonrasinda sayi : " + sayi);


    }


    public static int method2(int sayi){

        sayi = 25;
        System.out.println("Method2 icinde sayi : " + sayi);

        return sayi;
    }


    public static int method1(int sayi){

        sayi = 25;
        System.out.println("Method1 icinde sayi : " + sayi);

        return sayi;
    }
}
