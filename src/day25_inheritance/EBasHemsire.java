package day25_inheritance;

public class EBasHemsire extends DHemsire{
    EBasHemsire(){

        System.out.println(adres);// adres belirtilmedi
        adres="Cankaya";
        System.out.println(gorev);// Bas Hemsire
        System.out.println("Genel gorev : " + super.gorev);
        isim= "Ayse";
        System.out.println(this.isim);// Ayse
        System.out.println(super.isim); // Ayse
        this.maas();// Bas Hemsire maasi : 3000
        super.maas();// emsire maasi : 2000
        nobet();// Bashemsireler ayda 3 gun nobet tutar
        this.nobet(); // Bashemsireler ayda 3 gun nobet tutar
        super.nobet(); // Hemsireler haftada 2 gun nobet tutar

        ozelSigorta(); // hemsireler ozel sigorta yaptirabilir
        this.ozelSigorta(); // hemsireler ozel sigorta yaptirabilir
        super.ozelSigorta();// hemsireler ozel sigorta yaptirabilir

        tazminat(); // Bas hemsireler 13.maas alir
        this.tazminat(); // Bas hemsireler 13.maas alir
        // super.tazminat(); CTE
        // inheritance'da child'da yoksa parent'a bakilir
        // AMAAAA parent'da yoksa child'a bakilmaz CTE olur
    }

    String gorev= "Bas Hemsire";
    String adres = "Adres belirtilmedi";


    public void maas() {
        System.out.println("Bas Hemsire maasi : " + 3000);
    }

    public void nobet(){
        System.out.println("Bashemsireler ayda 3 gun nobet tutar");
    }

    public void tazminat(){
        System.out.println("Bas hemsireler 13.maas alir");
    }

    public static void main(String[] args) {
        EBasHemsire bh1 = new EBasHemsire();




    }
}
