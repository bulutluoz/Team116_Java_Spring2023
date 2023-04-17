package day16_arrayList;
import java.util.List;
public class C05_OgrenciNotlari {
    public static void main(String[] args) {
        // ogretmenden alinan ogrenci notlarinin ortalamasını ve kac ogrencinin ortalamanın ustunde not aldigini
        // bize ulastiran bir method yazın
        List<Integer> notlarListesi = C04_KullanicidanIntListOlusturma.kullanicidanSayiAlarakListeOlusturanMethod();
        notOrtVeOrtUstOgrenciSay(notlarListesi);
    }
    public static void notOrtVeOrtUstOgrenciSay(List<Integer> notlarListesi) {
        // not ortalaması
        int toplamNot = 0;
        int ortalamaNot = 0;
        int sayac = 0;
        // toplam notu bulmak icin listedeki bütün elemanları toplayan loop
        for (int i = 0; i < notlarListesi.size(); i++) {
            // 10 25 35 95 99 98
            toplamNot = toplamNot + notlarListesi.get(i);
        }
        // notlar toplamı / ogrenci sayisi = ortalama not
        ortalamaNot = toplamNot / notlarListesi.size(); // integer oldugu icin ortalama notun kusurati olmayacak
        // not ortalaması üzerindeki ogrenci sayısı
        for (int i = 0; i < notlarListesi.size(); i++) {
            // 10 25 35 95 99 98
            if (notlarListesi.get(i) > ortalamaNot) {
                sayac++;
            }
        }
        System.out.println("siniftaki ogrenci sayisi : " +notlarListesi.size());
        System.out.println("sinifin ortalama notu : " + ortalamaNot);
        System.out.println("sinifta ortalama not ustu ogrenci sayisi : " + sayac);
    }
}

