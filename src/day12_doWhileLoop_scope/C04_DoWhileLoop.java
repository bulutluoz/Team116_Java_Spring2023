package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	       Ornek :  input : 16, output: true


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int karekok=2;
        boolean tamKareMi= false;


        do {

            if (sayi == karekok*karekok){
                tamKareMi = true;
                break;
            }
            karekok++;

        }while (karekok*karekok <= sayi);

        System.out.println(tamKareMi);
    }
}
