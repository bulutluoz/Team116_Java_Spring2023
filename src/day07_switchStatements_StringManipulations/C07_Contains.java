package day07_switchStatements_StringManipulations;

public class C07_Contains {

    public static void main(String[] args) {

        String str = "Java ogren offer al";

        // str' da a harfi var mi ?

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("x")); // false

        // sadece harf mi aratiyoruz ?

        System.out.println(str.contains("Offer")); // false
        System.out.println(str.contains("offer")); // true


        // char aratabilir miyiz ?

        // System.out.println(str.contains('e')); charSequence lazim, char aratamiyoruz





    }
}
