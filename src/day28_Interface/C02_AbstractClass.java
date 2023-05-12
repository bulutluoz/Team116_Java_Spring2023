package day28_Interface;

public abstract class C02_AbstractClass {

    abstract void method1();

    void method2(){

    }

    public static void main(String[] args) {
        /*
            Abstract class'lar class olduklari icin Constructor'a sahiptirler
            ANCAK
            Abstract class'lardan OBJE OLUSTURULAMAZ

            cunku abstract class'larda abstract method'lar bulunabilir
            bu class'lardan obje olusturulursa
            abstract method'lari calistirmak ister
            ama abstract method'larin body'si olmadigindan
            bir deger uretemez

         */

        /*
        C02_AbstractClass abstractClassObje = new C02_AbstractClass();
        abstractClassObje.method1();

         */


    }
}
