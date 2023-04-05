package day11_methodOverloading_whileLoop;

public class C08_WhileLoop {

    public static void main(String[] args) {

        /*  While loop mu yoksa for loop mu ?
            bu sorunun cevabi yapacagimiz ise bagli

            dongu sayisi belli ise for loop kullanmak daha pratiktir.

            ancak baslangic , bitis degerleri verilmemisse,
            veya dongu sayisi belirli degilse while loop daha avantajli olur

         */


        // 1'den 100'e kadar olan sayilari yan yana yazdirin

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // ayni soruyu while loop ile yapalim

        int sayi= 1;

        while(sayi<=100){
            System.out.print(sayi + " ");
            sayi++; // unutulursa sonsuz loop olusur
        }


    }
}
