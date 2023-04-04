package day10_nestedForLoop_methodOlusturma;

public class C10_AsalsayiSonucuYazdirma {

    public static void main(String[] args) {
        // verilen sayinin asal sayi olup olmadigini yazdiran bir method olusturun

        asalSayiMiYazdir(37);
        asalSayiMiYazdir(79);
        asalSayiMiYazdir(234567);

    }


    public static void asalSayiMiYazdir(int sayi){

        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi % i == 0){
                asalMi=false;
                break;
            }
        }
        /*
            Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
         */

        if (asalMi){
            System.out.println(sayi + " sayisi asal");
        }else {
            System.out.println(sayi + " sayisi asal degil");
        }
    }
}
