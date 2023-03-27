package day05_ifElseStatements;

import java.util.Scanner;

public class C13_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //         vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //         vucut kitle endeksi 30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kg olarak agirliginizi giriniz");
        double agirlik = scanner.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke = agirlik*10000 / (boy *boy) ;

        if (vke>30){
            System.out.println("vke degeriniz : "+ vke + ", Maalesef obezsiniz" );
        } else if (vke>25) {
            System.out.println("vke degeriniz : "+ vke + ", Maalesef kilolusunuz" );
        } else if (vke>20) {
            System.out.println("vke degeriniz : "+ vke + ", Supersiniz" );
        }else {
            System.out.println("vke degeriniz : "+ vke + ", Maalesef cok zayifsiniz" );
        }
    }
}
