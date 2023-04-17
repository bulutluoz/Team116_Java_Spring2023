package day16_arrayList;
import java.util.Arrays;
import java.util.List;
public class C07_AsListMethodu {
    public static void main(String[] args) {
        Integer [] arr = {1,3,5};
        //Verilen bir arr'i liste çevirmek icin for loop oluşturup liste eklemeyi tavsiye ediyoruz
        // yinede gormek adina asList methodunu kullanalim
        List<Integer> arraydenList = Arrays.asList(arr);
        //System.out.println(arraydenList);  // [1, 3, 5]
        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("Arraydan list : " + arraydenList);
        // olusturulan listeye ekleme cikartma yapilabilmeli
        // arraydenList.add(5);  // UnsupportedOperationException
        // arraydenList.remove(1); // UnsupportedOperationException
        // Sadece array degistirilirse
        arr[0] = 23;
        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("arrayi degistirdikten sonra listin hali : " + arraydenList);
        /*
        Bir arrayi listeye cevirirken asList methodunu kullanmanin iki ana negatif yonu vardir:
        1- asList methodu ile olusturulan liste, esnek bir yapiya sahip degildir. Ekleme veya cikartma yapamayiz
        2- Kaynak array degistirildigi zaman, otomatik olarak bu arrayden olusturulan liste de degisir
         */
    }
}

