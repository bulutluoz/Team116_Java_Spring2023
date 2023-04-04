package day10_nestedForLoop_methodOlusturma;

public class C05_NestedForLoop {

    /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;

        *
        * *
        * * *
        * * * *
        * * * * *

     */

    public static void main(String[] args) {
        int sayi =4;

        for (int i = 1; i <=sayi ; i++) { // outer ==> satirlar
            for (int j = 1; j <=i ; j++) { // inner ==> sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
