package day27_pollymorphism_abstractClasses;

public abstract class C03_Araba {
    /*
        parent class'da istedigimiz herhangi bir method'u
        child class'larin TUMU override etmek zorunda kalsin istiyorsak
        o method'u abstract yapariz

        Eger abstract yapilan bir method
        tum child class'lar tarafindan OVERRIDE edilecekse
        parent class'daki abstract method
        hic bir zaman CALISMAYACAKTIR
        override edildigi icin guncel olan
        child class'lardaki overriding method'lar calisacaktir
        o zaman abstract method'larin body'ye ihtiyaci YOKTUR
     */

    abstract void teker();

    abstract void motor();

    abstract void gosterge();

    void guvenlik(){
        System.out.println("Arabalarin guvenlik onlemleri olsa iyi olur");
    }

    void klima(){
        System.out.println("Arabalarin klimalari olabilir");
    }

}
