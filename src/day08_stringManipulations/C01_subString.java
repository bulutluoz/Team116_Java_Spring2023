package day08_stringManipulations;

public class C01_subString {
    public static void main(String[] args) {

        String str = "Java çok güzel";

        System.out.println(str.substring(3)); // a çok güzel

        System.out.println(str.substring(5, 9)); // çok

        System.out.println(str.substring(2, 6)); // va ç

    }

}
