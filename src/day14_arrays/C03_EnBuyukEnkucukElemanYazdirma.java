package day14_arrays;
import java.util.Arrays;
public class C03_EnBuyukEnkucukElemanYazdirma {
    public static void main(String[] args) {
        /*
        Bir arrayin en buyuk ve en kucuk elemanini yazdirin
         */
        int []  arr = {3,6,8,5,4,3,4,6,7,5,3,2,6,8,9,3};
        System.out.println(Arrays.toString(arr));
        enBuyukEnkucukElemanYazdirma(arr);
        // Sadece sayilar degil yazilar icin de gecerli, sort kullanabiliriz
        String [] arrStr = {"Ali","Veli","Hasan"};
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));  //[Ali, Hasan, Veli]
    }
    public static void enBuyukEnkucukElemanYazdirma(int[] arr){
        // Arrays classindan sort metodu ile elemanları sıraladik
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // siralandiktan sonra en kucuk eleman en basta olacagi icin
        System.out.println("Arrayin en kucuk elemani : "+arr[0]);
        // siralandiktan sonra en buyuk eleman en sonda olacagi icin
        System.out.println("Arrayin en buyuk elemani : "+arr[arr.length-1]);
    }
}

