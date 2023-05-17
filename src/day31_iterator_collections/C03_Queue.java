package day31_iterator_collections;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> yemekSirasi = new LinkedList<>();

        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");

        // Murat ile Muhammed'in arasina bir eleman ekleyelim
        // queue ozelliginden dolayi, araya eleman EKLENEMEZ
        System.out.println(yemekSirasi); // [Murat, Muhammed]

        System.out.println(yemekSirasi.remove());
        // bastakini siler ve bize dondurur

        System.out.println(yemekSirasi); // [Muhammed]

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");

        System.out.println(yemekSirasi); // [Muhammed, Sevda, Veysel, Aysegul]

        System.out.println(yemekSirasi.poll()); // Muhammed

        System.out.println("poll'dan sonra  : " + yemekSirasi); // [Sevda, Veysel, Aysegul]

        Queue<String> liste2 = new LinkedList<>();
        // liste2.remove(); // NoSuchElementException
        System.out.println(liste2.poll()); // null


        yemekSirasi.offer("Firdevs");

        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        // eger kapasite sinirlamasi yoksa add() ile ayni islevi yapar

        System.out.println(yemekSirasi.peek()); // Sevda
        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        System.out.println(liste2.peek()); // null
        // bastaki elementi silmeden bize dondurur, bos liste olursa null dondurur


        System.out.println(yemekSirasi.element()); // Sevda
        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        // System.out.println(liste2.element()); // NoSuchElementException
        // bastaki elementi silmeden bize dondurur, bos liste olursa exception olusur




    }
}
