package day16_arrayList;
public class C08_ForEachLoop {
    //Soru 2- Verilen int array’deki her elementin karelerini alip,
    // karelerinin toplamini yazdiran bir method olusturun.
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 3, 4};
        arrKareToplamalari(arr);
    }
    public static void arrKareToplamalari(int[] arr) {
        // array elementleri
        int toplam = 0;
        for (int each : arr
        ) {
            // elementlerin karelerinin toplami
            toplam = toplam + each * each;  // toplam +=each;
        }
        System.out.println("arrayin elemanlarinin toplami : " + toplam);
    }
}

