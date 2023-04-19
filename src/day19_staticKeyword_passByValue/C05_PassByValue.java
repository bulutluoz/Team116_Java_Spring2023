package day19_staticKeyword_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

        double fiyat = 200;

        // fiyat uzerinde %10 indirim yapip, yeni fiyati yazdiran bir method olusturun
        indirimYap10(fiyat);

        System.out.println("Indirimli fiyat yazdirildiktan sonra : " + fiyat);

    }


    public static void indirimYap10(double aaa){

        aaa = aaa * 90 /100 ;

        System.out.println("%10 indirimli fiyat : " + aaa);
    }


    /*
        method'a yazdigimiz parametre ismi main method'daki variable ile ayni olmak zorunda DEGILDIR
        ama kodun daha anlasilabilir olmasi icin biz ayni ismi vermeyi TERCIH EDERIZ
     */
}
