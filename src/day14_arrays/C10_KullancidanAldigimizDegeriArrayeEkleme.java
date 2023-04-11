package day14_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class C10_KullancidanAldigimizDegeriArrayeEkleme {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */
        int[] arr1 = {2, 4, 6, 8};  // bu array'a 5 ekleyiniz >>> [2,4,6,8,5]
        // 1) Eski arrayin uzunluguna bir ekleyip yeni array olusturulmasi
        // 2) Eski arrayin degerlerinin kopyalanmasi
        // 3) Kullanicidan alinan degeri, yeni arrayin bos son gozune koyulmasi
        // 1) Eski arrayin uzunluguna bir ekleyip yeni array olusturulmasi
        int[] yeniArr = new int[arr1.length + 1];
        // 2) Eski arrayin degerlerinin kopyalanmasi
        for (int i = 0; i < arr1.length; i++) {
            yeniArr[i] = arr1[i];
        }
        //System.out.println(Arrays.toString(yeniArr)); // [2, 4, 6, 8, 0]
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arraya eklenecek degeri giriniz");
        int eklenecekDeger = scan.nextInt();
        yeniArr[yeniArr.length - 1] = eklenecekDeger;
        System.out.println(Arrays.toString(yeniArr)); // [2, 4, 6, 8, 45]
    }
    public static int[] kullaniciArrayElemanEkleme(int[] arr1) {
        // 1) Eski arrayin uzunluguna bir ekleyip yeni array olusturulmasi
        // 2) Eski arrayin degerlerinin kopyalanmasi
        // 3) Kullanicidan alinan degeri, yeni arrayin bos son gozune koyulmasi
        // 1) Eski arrayin uzunluguna bir ekleyip yeni array olusturulmasi
        int[] yeniArr = new int[arr1.length + 1];
        // 2) Eski arrayin degerlerinin kopyalanmasi
        for (int i = 0; i < arr1.length; i++) {
            yeniArr[i] = arr1[i];
        }
        //System.out.println(Arrays.toString(yeniArr)); // [2, 4, 6, 8, 0]
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arraya eklenecek degeri giriniz");
        int eklenecekDeger = scan.nextInt();
        yeniArr[yeniArr.length - 1] = eklenecekDeger;
        arr1 = yeniArr;
        return arr1;
    }
}
