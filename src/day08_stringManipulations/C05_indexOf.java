package day08_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        /*

        indexOf() methodu aranan yazı parçacığının, yazı içerisindeki index'sini bize cevap olarak verir ( dondurur)
         */

        String str = "Java en iyisi en en en en";

        System.out.println(str.indexOf("e")); //5
        System.out.println(str.indexOf("a")); //1

        System.out.println(str.indexOf("en")); //5
        System.out.println(str.indexOf("yi")); //9
        System.out.println(str.indexOf("iyisi")); //8
        System.out.println(str.indexOf("is")); // 10
        System.out.println(str.indexOf("iy")); // 8
        System.out.println(str.indexOf("o")); // -1
        System.out.println(str.indexOf("en güzeli")); //-1

        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("a", 1)); //1
        System.out.println(str.indexOf("a", 2)); //3
        System.out.println(str.indexOf("i")); // 8
        System.out.println(str.indexOf("i", 5)); // 8
        System.out.println(str.indexOf("i", 6)); // 8
        System.out.println(str.indexOf("i", 9)); // 10
        System.out.println(str.indexOf("i",11)); // 12


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        // "Java en iyisi"  içerisinde "en" kelimesi için
        // str.indexOf("en")

        if (str.indexOf("en")==-1){
            System.out.println("bu cümlede aradığınız kelime yok");
        }else {
            int birinciKelimeIndex = str.indexOf("en");
            if (str.indexOf("en",birinciKelimeIndex+1)==-1){
                System.out.println("bu cümlede aradığınız kelime bir tane");
            }else {
                System.out.println("Bu cümlede aradığınız kelimeden birden çok adet var");
            }
        }

    }
}
