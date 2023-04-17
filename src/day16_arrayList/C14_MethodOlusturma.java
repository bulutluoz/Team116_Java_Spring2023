package day16_arrayList;
public class C14_MethodOlusturma {
    public static void main(String[] args) {
        // iki sayiyi toplayan ve sonucu donduren bir method
        int a = 12;
        int b = 23;
        System.out.println(toplamaMethodu(a, b));  //
    }
    public static int toplamaMethodu (int a, int b){
        int sonuc =0;
        sonuc = a+b;
        return sonuc;
    }
}