package day06_nestedIfElseStatements_ternaryOperators;

public class C05_ternaryOperators {
    public static void main(String[] args) {

        int sayi = 14;

        // sayinin tek veya cift oldugunu yazdirin

        if (sayi%2==0){
            System.out.println("Verilen sayi cift sayidir");
        }else{
            System.out.println("Verilen sayi tek sayidir");
        }

        // ternary operator'leri basit if-else cumlelerini daha kisa yazabilmek icin kullanilir

        System.out.println(sayi % 2 == 0 ? "Verilen sayi cift sayidir" : "Verilen sayi tek sayidir");


    }
}
