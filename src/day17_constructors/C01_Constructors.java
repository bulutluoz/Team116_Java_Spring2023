package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Constructors {

    String str = "Constructor";
    int sayi = 10;
    static boolean isHappy= true;

    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

           List<String>                            isimler   =   new      ArrayList<>();

        // olusturmak istedigimiz datanin turu    obje ismi  = keyword     Constructor

        // abc() ==> method'dur

        // Constructor bir class'dan obje olusturmak icin kullandigimiz ozel bir java yapisidir
        // Constructor method'a benzer ama method degildir.


    }

    public static void staticMethod(){
        System.out.println("C01 static method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("C01 static olmayan method calisti");
    }
}
