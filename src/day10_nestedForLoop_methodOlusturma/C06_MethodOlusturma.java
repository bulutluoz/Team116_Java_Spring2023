package day10_nestedForLoop_methodOlusturma;

public class C06_MethodOlusturma {

    public static void main(String[] args) {

        String str = "java'nin robotlari";

        str.toUpperCase();

        /* Eger bir method bize bir sonuc döndürüyorsa
           method'u calistirmak
           sonucu gormek icin yeterli DEGILDIR

           sonucu gormek istiyorsak
           - ya direk methodCall'u sout icerisinde yapariz
           - veya donen bilgiyi bir variable'a kaydeder
             kodumuzda istedigimiz zaman onu yazdirir veya kullaniriz

         */

        System.out.println(str.toUpperCase()); // JAVA'NIN ROBOTLARI

        str = str.toUpperCase();
    }
}
