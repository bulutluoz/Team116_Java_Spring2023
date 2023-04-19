package day19_staticKeyword_passByValue;

public class C02 {

    static String staticV= "Java";
    String isimIns= "Sevda";

    public static void main(String[] args) {

        C02 obj1 = new C02();

        System.out.println(obj1.isimIns);// Sevda
        System.out.println(obj1.staticV);//Java
        obj1.isimIns="Akif";
        System.out.println(obj1.isimIns);// Akif


        C02 obj2 = new C02();

        System.out.println(obj2.isimIns); // Sevda
        System.out.println(obj2.staticV); // Java

        obj2.isimIns = "Ayse";
        obj2.staticV = "Hava";

        System.out.println(obj1.isimIns); // Akif
        System.out.println(obj1.staticV); // Hava
        System.out.println(obj2.isimIns); // Ayse
        System.out.println(obj2.staticV); // Hava
        System.out.println(staticV); // Hava


    }
}
