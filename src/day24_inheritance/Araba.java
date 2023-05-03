package day24_inheritance;

public class Araba {

    String marka = "Araba markasi belirtilmedi";
    String model = "Arabanin modeli belirtilmedi";
    int tekerSayisi = 4;


    public void hiz(){
        System.out.println("Arabalar motor ve yakita gore maximum hiz belirler");
    }

    public void guvenlik(){
        System.out.println("Tum arabalar guvenlik onlemleri bulundurmalidir");
    }



    /*
        Bir projede kod yazmaya baslamadan once tasarim yapilmalidir
        olusturulacak muhtemel class'lar belirlenmeli
        bunlar arasinda nasil bir iliski kurulacagi,
        hangi class'larin parent/child olacagi dusunulmelidir

        Daha genel ozellikler parent class'lara
        daha spesifik ve o class'a ait ozellikler child class'lara konulmalidir

        Araba ve Toyota class'lari obje olusturmayacagimiz,
        sadece child class'larini organize etmek
        ve ortak ozellikleri belirlemek icin
        tasarlanan class'lardir
        Bu tur class'larda main method olmasina gerek yoktur
        (abstract class ve Interface'lerde ele alinacak)

        Bir ozelligi variable olarak olusturmak ile
        method (dinamik ozellikler)olarak olusturmak arasinda
        kullanimda bir fark vardir. (Overriding konusunda ele alinacak)



     */
}
