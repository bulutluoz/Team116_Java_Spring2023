package day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindaki 3 ile bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 pozitif tamsayi girin");

        int ilkSayi= scanner.nextInt();
        int ikinciSayi = scanner.nextInt();

        if (ilkSayi>ikinciSayi){
            System.out.println("Ilk sayi daha kucuk olmalidir");

        }else{

            for (int i = ilkSayi; i <=ikinciSayi ; i++) {

                if (i%3 == 0){
                    System.out.print(i + " ");
                }
            }
        }

    }
}
