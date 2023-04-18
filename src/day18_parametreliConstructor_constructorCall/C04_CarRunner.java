package day18_parametreliConstructor_constructorCall;

public class C04_CarRunner {
    public static void main(String[] args) {

        C03_Car car1 = new C03_Car();

        System.out.println(car1);


        // mecburi alan olarak fiyat ve marka doldurulsun

        C03_Car car2 = new C03_Car(12000,"Toyota");
        System.out.println(car2);

        C03_Car car3= new C03_Car(10000,"Opel");
        System.out.println(car3);

        // Constructor icinde bizim gonderdigimiz parametreler disinda
        // baska islemler de olabilir
        // Kod okuma sorularinda constructor'daki atamalara dikkat edilmelidir
        C03_Car car4 = new C03_Car("Honda");
        System.out.println(car4);

        C03_Car car5 = new C03_Car("Volvo");
        System.out.println(car5);

        C03_Car car6 = new C03_Car("Nissan");
        System.out.println(car6);
    }
}
