package day16_arrayList;
import java.util.Scanner;
public class C11_ForEachLoopQ {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
        // java
        //  1) split ile "" parcaliyoruz , array haline getiriyoruz
        //  2) forEachLoop ile harler teker teker kontrol edilir
        //  3) istenilen harfe denk gelindiginde sayac bir artirilir
        //  4) sayac 0 ise “harf cumlede kullanilmamis”,,,, sifirdan fazla ise kackere kullanildigi yazdirilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str = scan.nextLine();
        System.out.println("lütfen aranan kelimeyi giriniz");
        String arananHarf = scan.next();
//        String str = "Java ile her sey cok kolay";
//        String arananHarf ="a";
        //  1) split ile "" parcaliyoruz , array haline getiriyoruz
        String[] arr =str.split("");
        //  2) forEachLoop ile harler teker teker kontrol edilir
        int sayac = 0;
        for (String each: arr
        ) {
            //  3) istenilen harfe denk gelindiginde sayac bir artirilir ( istenilen harf "a" )
            if (each.equals(arananHarf)){
                sayac++;
            }
        }
        //  4) sayac 0 ise “harf cumlede kullanilmamis”,,,, sifirdan fazla ise kackere kullanildigi yazdirilir
        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("aranan harf cumle icinde "+ sayac+" kere kullanilmis");
        }
    }
}
