package day25_inheritance;

public class BToyota extends Araba {
    BToyota(){

        System.out.println("Toyota constructor calisti");
    }
    BToyota(int yil){
        this();

        System.out.println("Toyota int parametreli constructor calisti");
    }

    String uretimYeri;
    String marka= "Toyota";
}
