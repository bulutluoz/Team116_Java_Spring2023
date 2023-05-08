package day26_inheritanceDataTypeKullanimi_overriding;

public class Overriding3 extends Overriding2{

    public void method1(){
        System.out.println("Overriding3 method1");
    }

    @Override
    public void method3() {
        //super.method3();
    }
    /*
        Overriding method'u IntelliJ'e de olusturtabiliriz
        bu durumda IntelliJ 2 sey ekler
        1- @Override Annaotation
           kullanmak zorunda degiliz
           silerseniz CTE olmaz
           @Override notasyonu parent class'daki
           overridden method'u kontrol eder
           ve silinirse CTE verir

        2- super.method3()
           mecburi degildir,
           silerseniz CTE olmaz
           bir class'da hem overridden method hem overriding method CALISMAZ

           Eger en guncel method ile birlikte
           parent class'da gecersiz kilinan (overridden)
           method'un da calismasini isterseniz
           super.method3() kullanabilirsiniz

     */

    public static void main(String[] args) {

        Overriding3 obj1 = new Overriding3();
        obj1.method1(); // Overriding3 method1
        obj1.method2(); // Overriding2 method2


        Overriding2 obj2 = new Overriding3();
        obj2.method1(); // Overriding3 method1
        obj2.method2(); // Overriding2 method2


        Overriding1 obj3 = new Overriding3();
        obj3.method1(); // Overriding3 method1
        obj3.method2(); // Overriding2 method2


        Overriding1 obj4 = new Overriding1();
        obj4.method1(); // Overriding1 method1
        obj4.method2(); // Overriding1 method2
    }
}
