package day34_nestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {

    public static void main(String[] args) {

        /*
            TreeMap elementleri dogal sirali olarak tuttugu,
            ve yeni eklenen elementleri de bu siralamaya uygun bir konuma yerlestirdigi icin
            diger map'lerde olmayan bazi ekstra ozelliklere sahiptir
         */

        TreeMap<Integer,String> ogrenciMap = new TreeMap<>();
        ogrenciMap.put(103,"Ali Can");
        ogrenciMap.put(120,"Veli Cem");
        ogrenciMap.put(101,"Akif Han");
        ogrenciMap.put(140,"Yusuf San");

        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.subMap(103, 110));// {103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 120));// {103=Ali Can}
        System.out.println(ogrenciMap.subMap(103,false, 120,true));
        // {120=Veli Cem}

        // sadece sinirlar yazilirsa baslangic dahil, bitis haric olur
        // ama istersek baslangiv ve bitisin dahil olup olmamasini boolean degerler ile belirleyebiliriz


        System.out.println(ogrenciMap.descendingMap());// {140=Yusuf San, 120=Veli Cem, 103=Ali Can, 101=Akif Han}
        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.descendingKeySet());// [140, 120, 103, 101]

        // kullanildigi satirda TreeMap'in siralamasini terse cevirir
        // ama bu degisim kalici olmaz, sadece o satira ait bir islemdir

        System.out.println(ogrenciMap.lowerKey(120)); // 103 kucuk olan
        System.out.println(ogrenciMap.lowerEntry(120)); // 103=Ali Can

        System.out.println(ogrenciMap.floorKey(103)); // asagi yuvarla 103
        System.out.println(ogrenciMap.floorKey(105));// asagi yuvarla 103
        System.out.println(ogrenciMap.floorKey(119));// asagi yuvarla 103
        System.out.println(ogrenciMap.floorKey(120));// asagi yuvarla 120
        System.out.println(ogrenciMap.floorEntry(135)); // 120=Veli Cem


        System.out.println(ogrenciMap.higherKey(120)); // buyuk olan 140
        System.out.println(ogrenciMap.higherEntry(100)); // 101=Akif Han

        System.out.println(ogrenciMap.ceilingKey(120)); // yukari yuvarla 120
        System.out.println(ogrenciMap.ceilingEntry(100)); // yukari yuvarla 101=Akif Han


        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.headMap(120));// basa dogru map
        // {101=Akif Han, 103=Ali Can} bitisler dahil olmaz

        System.out.println(ogrenciMap.headMap(130));// {101=Akif Han, 103=Ali Can, 120=Veli Cem}

        System.out.println(ogrenciMap.headMap(120, true));
        // {101=Akif Han, 103=Ali Can, 120=Veli Cem} bitis olarak verilen key'i dahil eder
        System.out.println(ogrenciMap.headMap(130,true));
        // {101=Akif Han, 103=Ali Can, 120=Veli Cem} 130 olmadigi icin dahil edemez


        System.out.println(ogrenciMap.tailMap(120)); // sona dogru map
        // {120=Veli Cem, 140=Yusuf San} 120 baslangic degeri oldugundan inclusive

        System.out.println(ogrenciMap.tailMap(120,false));
        // {140=Yusuf San}  false yazdigimiz icin exclusive olur


        System.out.println(ogrenciMap.firstKey()); // 101
        System.out.println(ogrenciMap.firstEntry()); // 101=Akif Han
        System.out.println(ogrenciMap.lastKey()); // 140
        System.out.println(ogrenciMap.lastEntry()); // 140=Yusuf San

        System.out.println(ogrenciMap.pollLastEntry()); // 140=Yusuf San
        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.pollFirstEntry()); // 101=Akif Han
        System.out.println(ogrenciMap); // {103=Ali Can, 120=Veli Cem}

        ogrenciMap.clear();
        System.out.println(ogrenciMap); // {}


    }
}
