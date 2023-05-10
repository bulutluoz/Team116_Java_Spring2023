package day27_pollymorphism_abstractClasses;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{

    void method1(){

    }

    double method2() {
      // Return type void veya PRIMITIVE data turu ise
      // overridden method ile overriding method'un return type'lari
      // AYNI OLMALIDIR
        return 3;
    }
    String method3(){
      // Return type NON-PRIMITIVE ise
      // child class'daki method'un return type'i
      // parent class'daki overridden method'un return type'inin
      // AYNISI veya CHILD CLASS'i olmalidir
      // (IS-A reletionship ile kontrol edilebilir)
      //  Covariant

        return "Selenium Heyecandir";
    }

    ArrayList<String> method4(){
        return new ArrayList<>();
    }
}
