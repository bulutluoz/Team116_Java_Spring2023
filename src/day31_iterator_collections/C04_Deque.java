package day31_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {
        // double ended queue
        // genel olarak queue ozelliklerini gosterir
        // ancak bastan ve sondan ekleme-cikarma gibi ozellikler olur

        Deque<String> deq = new LinkedList<>();

        deq.add("Adnan");
        deq.addLast("Sevda");

        System.out.println(deq); // [Adnan, Sevda]

        deq.addFirst("Saida");

        System.out.println(deq); // [Saida, Adnan, Sevda]

        System.out.println(deq.removeLastOccurrence("Sevda")); // true
        System.out.println(deq); // [Saida, Adnan]
        // tek sevda oldugu icin remove(Obj), removeFirstOccurance(Obj) veya lastOccurance(Obj) fark olmaz

        System.out.println(deq.pop()); // Saida
        System.out.println(deq); // [Adnan]
        // ilk elementi siler ve bize dondurur removeFirst()'e benzer


        Deque<String> bosDeq= new LinkedList<>();
        // bosDeq.removeFirst(); // NoSuchElementException
        // bosDeq.pop();// NoSuchElementException





    }
}
