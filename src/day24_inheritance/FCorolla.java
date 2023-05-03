package day24_inheritance;

public class FCorolla extends EToyota{
    FCorolla(){
        System.out.println("Corolla constructor calisti");
    }

    String uretimYeri="Turkiye";
    String model = "Corolla";
    public static void main(String[] args) {

        FCorolla corolla = new FCorolla();
        System.out.println(corolla.model); // F Corolla
        System.out.println(corolla.marka); // E Toyota
        System.out.println(corolla.motor); // D arabalarda motor vardir
        System.out.println(corolla.uretimYeri);// F Turkiye
    }

}
/*
    Bir obje olusturuldugunda
    Constructor calisir ve
    class level'da var olan variable'larin
    bir kopyasi olusturulup objeye ilisiklendirilir.


    Bir class'da gorunur bir constructor yoksa
    o class'da default constructor vardir

    Java inheritance'da obje olusturuldugunda
    parent class'lardaki constreuctor'larin da calismasi icin
    buna benzer bir mekanizma olusturmustur

    extends keyword kullanilan bir class'da
    var olan her constructor'in ilk satirinda
    gorunur bir constructor call yoksa
    gorunmeyen bir super() constructor call vardir
    super() : parent class'daki parametresiz constructor call
 */