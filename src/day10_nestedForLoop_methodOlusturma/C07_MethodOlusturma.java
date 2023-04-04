package day10_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {

    public static void main(String[] args) {

        // verilen iki sayinin toplamini yazdiran bir method olusturun


        ikiSayiTopla(5,9);
        ikiSayiTopla(7,1);
        ikiSayiTopla(67,87);



    }

    public static void ikiSayiTopla(int sayi1, int sayi2){
        /*
            public : access modifier ==> erisim belirleyici, simdilik hep public yapalim
            static : ozel bir keyword'dur ileride anlatilacak, simdilik hep static yapalim
            void   : return type , method'un bana bir sey dondurmeyecegini, sadece yazdiracagini belirtir
            isim   : method'un yaptigi is ile baglantili olmali
            (parametreler) : method'un yapacagi is icin bizim gondermemiz gereken degiskenler
         */

        System.out.println("Iki sayinin toplami : " + (sayi1+ sayi2));
    }



}
