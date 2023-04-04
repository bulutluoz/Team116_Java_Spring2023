package day10_nestedForLoop_methodOlusturma;

public class C09_FaktoryelDegeriYazdirma {

    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryel degerini yazdiran
        // bir method olusturun

        faktoryelDegeriYazdir(5); // 5! = 120

        faktoryelDegeriYazdir(7); // 7! = 5040


    }

    public static void faktoryelDegeriYazdir(int sayi){

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;
        }

        System.out.println(sayi+"! = "+ faktoryel);

    }


}
