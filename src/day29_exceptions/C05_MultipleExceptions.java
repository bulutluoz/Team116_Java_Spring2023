package day29_exceptions;



import java.util.Scanner;

public class C05_MultipleExceptions {
    /*
        Eger birden fazla exception olusma ihtimali varsa
        ve bu exception'lar arasinda parent-child iliskisi yoksa
        3 farkli yaklasim kullanabiliriz

        1- iki farkli exception ihtimali icin 2 farkli try-catch olusturabiliriz
        2- bir try 2 catch blogu olusturabiliriz
        3- 2 exception'i kapsayan tek bir exception varsa onu kullanarak 1 try-1 catch ile sorunu cozeriz
     */

    public static void main(String[] args) {
        // Elimizde input olarak verilmis bir String ve sayilardan olusan bir array var

        String  str = "Java her seyi dusunmus";
        int[] sayilar = {2,4,6,7,8,9,1,3,4,2,6,3,7,4};

        // Kullanicidan 0 veya pozitif bir tamsayi isteyin
        // verilen tamsayiyi index olarak kullanip
        // String ve Array'den o index'deki harf ve sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen index olarak pozitif bir tamsayi giriniz");
        // kullanici duzgun tammsayi girecek kabul edelim
        int index = scanner.nextInt();

        // 1.yontem
        /*
        System.out.print("istenen index'deki degerler : " );

        try {
            System.out.print(str.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.print("Verilen index String'in sinirlari disinda ");
        }

        try {
            System.out.println(sayilar[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Verilen index Array'in sinirlari disinda");
        }
         */

        // 2.yontem
        // 1 try birden fazla catch oldugunda
        // bir catch calisinca otekilere bakmaz (if -else if -else gibi)
        /*
        try {
            System.out.print("istenen index'deki degerler : "+str.charAt(index)+sayilar[index] );
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Verilen index String'in sinirlari disinda ");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Verilen index Array'in sinirlari disinda");
        }

         */

        // 3.yontem
        // bu cozumde detay'a bakmadigimiz icin
        // iki exception'i da kapsayacak genel bir aciklama yazabiliriz

        try {
            System.out.print("istenen index'deki degerler : "+str.charAt(index)+sayilar[index] );
        } catch (Exception e) {
            System.out.print("Verilen index input'un sinirlari disinda ");
        }


    }
}
