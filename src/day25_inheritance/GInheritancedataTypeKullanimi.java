package day25_inheritance;

import java.util.ArrayList;
import java.util.List;

public class GInheritancedataTypeKullanimi {

    public static void main(String[] args) {


        String str= "Java Candir";
        Integer sayi = 20;
        Boolean bl = true;

        Object obj1 = str; // String is-a Object
        Object obj2 = sayi; // Integer is-a object
        Object obj3= bl; // Boolean is-a object
        Object obj4 = new String("Tava");
        Object obj5 = new Integer(20);
        Object obj6 = new Boolean(true);

        // Integer dnm1= str;  String is-a Integer diyemeyiz


        ArrayList<String> isimler1 = new ArrayList<>();
        List<String> isimler2 = new ArrayList<>(); // ArrayList is-a List

        // ArrayList AbstractList'in Child'i
        // AbstractList'de List'in Child'i

        /*
            Java da bir obje olusturdugumuzda
            String str= "Java Candir";
            Object obj1 = str;
            List<String> isimler2 = new ArrayList<>();

            DataTuru variableIsmi = deger ; yazariz

            Burada kullandigimiz String,Object,Integer... hem data turudur, hem de class adidir

            Eger non-primitive data turlerinden bahsediyorsak
            esitligin sol tarafindaki dataTuru olan class ile
            constructor'in kullanildigi class'lar arasinda is-a reletionship olmalidir


         */

    }
}
