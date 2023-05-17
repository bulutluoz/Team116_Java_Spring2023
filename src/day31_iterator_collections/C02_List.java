package day31_iterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        List<String> liste = new LinkedList<>();
        System.out.println("Bos liste hash kod : " + liste.hashCode());

        liste.add("Esat");
        liste.add("Sevda");
        liste.add("Ilknur");
        liste.add("Seyma");

        System.out.println(liste); // [Esat, Sevda, Ilknur, Seyma]
        System.out.println("4 element'den sonra hash kod : " + liste.hashCode());

        liste.add(2,"Nurhayat");

        System.out.println(liste); // [Esat, Sevda, Nurhayat, Ilknur, Seyma]
        System.out.println("5 element'den sonra hash kod : " + liste.hashCode());


        List<String> liste2 = new LinkedList<>();
        liste2.add("Yusuf");
        liste2.add("Esat");
        liste2.add("Ilknur");
        liste2.add("Murat");
        System.out.println(liste2); // [Yusuf, Esat, Ilknur, Murat]

        System.out.println(liste.retainAll(liste2)); // true

        System.out.println("liste son hali : "+ liste); // [Esat, Ilknur]
        // ortak elemanlar kalir, digerlerini siler

    }
}
