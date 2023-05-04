package day25_inheritance;

import day24_inheritance.FCorolla;

public class Corolla extends BToyota{
    Corolla(){

        System.out.println("Corolla constructor calisti");
    }

    Corolla(int sayi){

        System.out.println("Corolla int parametreli constructor calisti");
    }
    Corolla(String yakit){
        super(5);
        // Parent class'da olmayan bir constructor
        // call yapilirsa Java CTE verir
        System.out.println("Corolla string parametreli constructor calisti");
    }

    String uretimYeri="Turkiye";
    String model = "Corolla";
    public static void main(String[] args) {

        // Corolla corolla = new Corolla(5);
        Corolla corolla2= new Corolla("Elektrik");


    }

}

