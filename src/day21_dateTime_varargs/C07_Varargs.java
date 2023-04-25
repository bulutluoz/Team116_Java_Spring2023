package day21_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        topla(15,6); // sayilar[] = {15,6}  Verilen 2 elementin toplami : 21
        topla(15,20,25); // sayilar[] = {15,20,25} Verilen 3 elementin toplami : 60
        topla(10,13,44,35); // sayilar[] = {10,13,44,35}
        topla(12,14,14,12,23); // Verilen 5 elementin toplami : 75
        topla(1,3,5,7,8,3,4,2); // Verilen 8 elementin toplami : 33
        topla(2,3,5,6,7,8,9,1,2,3,5);
        topla(3,2,3,4,5,6,7,8,9,12,13,23,34,45); // Verilen 14 elementin toplami : 174
    }

    public static void topla(int... sayilar){

        /*
            java'da int... , String... gibi variable data turunun yanina ... konursa
            uzunlugu degisken olan bir array ifade eder
            buna varargs denir  (variety of arguments)
         */

        int toplam=0;

        for (int each:sayilar
             ) {
            toplam += each;
        }

        System.out.println("Verilen " + sayilar.length + " elementin toplami : " + toplam);
    }
}
