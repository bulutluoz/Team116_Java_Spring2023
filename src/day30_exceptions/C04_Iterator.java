package day30_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar); // [5, 12, 3, 9]

        // list'deki tum elementleri 2 artirip, yeni halini kaydedin

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i , sayilar.get(i)+2);
        }

        System.out.println(sayilar); // [7, 14, 5, 11]

        /*
            java'da farkli ozelliklere sahip
            birden fazla element barindirabilen
            cok sayida yapi vardir

            biz bugune kadar : array ve list gorduk
            yarin : collections (linkedList, queue, deque, Set)
            sonra : maps

            Bu yapilarin hepsi index kullanmaz

         */

        // Index kullanmadan list'deki elementleri 2 artirip yazdirin

        for (Integer eachElement:sayilar
             ) {
            System.out.print(eachElement+2+" ");
        }

        // degerleri 2 artirip yazdirdik ama list degisti mi ? HAYIR

        System.out.println("\n"+sayilar);

        // for-each kullanarak list'in elementlerini 2 artirip
        // list'in yeni degerlerini kaydedin

        for (Integer eachElement:sayilar
        ) {
            eachElement +=2;
        }

        System.out.println(sayilar); // [7, 14, 5, 11]

        Iterator itr = sayilar.iterator();

        /*
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();
         */

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(sayilar); // []

    }
}
