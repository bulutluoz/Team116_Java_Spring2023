package day14_arrays;
public class C11_Method {
    public static void main(String[] args) {
        // toplama methodu
        // iki sayi girişi
        // bir sayi sonucu
        int yazdiracm =toplamaMethodu(5,7);
        System.out.println(yazdiracm);
    }
    // ne döndürecek int
    // makinenin icine ne koyulacak ()
    // dondurulecek kisim return densonra tekrar yazilir
    public static int toplamaMethodu (int sayi1, int sayi2){
        int sonuc =0;
        sonuc= sayi1+sayi2;
        return sonuc;   // method bunu dondur
    }
}

