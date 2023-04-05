package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {
        // kullanicidan bir sayi alip 3'ile bolunup bolunemedigini yazdirin
        // kullanici 3 ile bolunebilen bir sayi girinceye kadar
        // tekrar deger isteyin

        /*
            Tekrar sayisi tam olarak bilinmeyen
            tekrar sayisi farkli bir sarta bagli olan durumlarda while loop kullaniriz
         */


        Scanner scanner = new Scanner(System.in);


        // girilen sayi 3'e bolunebilene kadar tekrar et
        // while loop'da () icine yazilan sart saglanmadigi muddetce
        // kod tekrar calisir

        int sayi=30;

        while(sayi %3 != 0){
            System.out.println("Lutfen pozitif bir tamsayi girin");
            sayi= scanner.nextInt();

            if (sayi%3==0){
                System.out.println("sayi 3 ile tam bolunuyor");
            }else{
                System.out.println("sayi 3 ile tam bolunemiyor");
            }
        }
    }
}
