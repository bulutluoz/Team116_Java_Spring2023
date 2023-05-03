package day24_inheritance;

public class Corolla extends BToyota{

    String uretimYeri="Turkiye";
    String lastik ="corolla araclar pireli 205-60-16 lastik kullanir";
    String model = "Corolla";
    boolean otopark = false;
    boolean cruiseControl=true;

    public void hiz(){
        System.out.println("Corolla araclar max 240 km hiz yapar");
    }
    public void guvenlik(){
        System.out.println("Corolla araclar 12 hava yastigi kullanir");
    }

    public static void main(String[] args) {

        Corolla corolla1= new Corolla();
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.lastik); // C pirelli 205
        System.out.println(corolla1.model); // C Corolla
        System.out.println(corolla1.otopark); // C false
        System.out.println(corolla1.cruiseControl); // C true
        System.out.println(corolla1.marka); // B Toyota
        System.out.println(corolla1.tekerSayisi); // A 4
        corolla1.hiz(); // C 240
        corolla1.guvenlik(); // C 12 hava yastigi
        corolla1.aku(); // B inci aku

    }


}
