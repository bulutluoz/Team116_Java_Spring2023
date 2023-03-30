package day08_stringManipulations;

public class C09_replace {
    public static void main(String[] args) {

        /*
        bir yazı içerisinde belli başlı harfleri veyakelimeleri istediğimiz başka bir unsur değiştirmek için kullanılır
         */

        String str = "Javasiz olmaz";

        System.out.println(str.replace('J', 'H')); // Havasiz olmaz

        System.out.println(str.replace("a", "")); // Jvsiz olmz
        System.out.println(str.replace("Javasiz", "X")); // X olmaz
        System.out.println(str.replace("v","yayayayaya")); // Jayayayayayaasiz olmaz
        System.out.println(str.replace("va", "lallala")); // Jalallalasiz olmaz

        System.out.println(str); // Javasiz olmaz

//        str = str.replace("va", "lallala"); //Jalallalasiz olmaz // atama ( = ) yaparsak orjinal str değişir.
//        System.out.println(str);

        /*
        atama yapılmadığı sürece yapılan değişiklikler sadece o satır için geçerlidir. atama yapılana kadar kalıcı olmaz
         */

        // str1 icindeki bosluklari yok edin
        String str1 = "Java ile hayat       Cok daha guzel";
        System.out.println(str1.replace(" ", ""));
        System.out.println("str1 = " + str1);
        str1 = str1.replace(" ","");
        System.out.println("str1 = " + str1);

        String str2 = " Java hayattir";
        System.out.println(str2.replaceFirst("a", "X"));


    }


}
