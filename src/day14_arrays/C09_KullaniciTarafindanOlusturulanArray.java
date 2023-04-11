package day14_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class C09_KullaniciTarafindanOlusturulanArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1) kullaniciden array boyutu al
        System.out.println("Lütfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int[arrayBoyut];
        int arrayElementi=0;
        // arrayin boyutu kadar loop ile, arrayin elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("lütfen arrayin "+i+"ci elemanini giriniz");
            arrayElementi= scan.nextInt();
            arr[i]=arrayElementi;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] kullaniciArrayOlusturma(){
        Scanner scan = new Scanner(System.in);
        // 1) kullaniciden array boyutu al
        System.out.println("Lütfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int[arrayBoyut];
        int arrayElementi=0;
        // arrayin boyutu kadar loop ile, arrayin elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("lütfen arrayin "+i+"ci elemanini giriniz");
            arrayElementi= scan.nextInt();
            arr[i]=arrayElementi;
        }
        return arr;
    }
}
