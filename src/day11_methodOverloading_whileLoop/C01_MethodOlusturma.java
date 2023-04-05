package day11_methodOverloading_whileLoop;

public class C01_MethodOlusturma {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan input olarak alinan bir String'den,
        //         baslangic ve bitis indexlerine gore baslangic index'i dahil,
        //         bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        //         - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
        //           hata mesaji verin
        //         - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

        substringYazdir("Java Candir",2,7);
    }


    public static void substringYazdir(String metin, int basIndex, int bitIndex){

        if (basIndex > bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (bitIndex>(metin.length()-1)) {
            System.out.println("Istediginiz index metin'in disinda");
        }else{

            for (int i = basIndex; i <bitIndex ; i++) {

                System.out.print(metin.charAt(i));
            }


        }
    }
}
