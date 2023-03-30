package day08_stringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {

        /*
        null bir değer değildir
        null bir pointer'dır
        non-primitive datalara değer atanmadığını işaret eder

         */

        String str; // değer tanmadığıiçin yazdırma vs işlemleri yapılamıyor
        // System.out.println(str); // CTE // değer atama yapılmadan normalde yazdırma yapılamaz

        /*
        yinede değer ataması yapmadan, boş olarak kalmasını,lakin en azından yeri geldiği zaman en azından
        yazdırılabilmesini istiyorsak null pointer kullanılır.


         */

        str = null; // str'a bir değer atanmadı, Sadece boş olduğunu bildiğimizi javaya bildirdik
        // str hala boş

        System.out.println(str); // nul // içinde bir şey olmamasına karşın null pointer ile gösterildiği için
        // en azından yazdırma işlemi yapılabiliyor

        /*
        yazdırma gibi işlemlerde hata veremesi için boş değere null ataması yapılır
         */

        // str.concat("Ali");  // NullPointerException  // null olan bir değer ile metodlar kullanılamaz
        //System.out.println(str.length()); // yok olan bir şeyin uzunluğu ölçülemez

        String test = "";  // burda testin içinde "" kayıt altına alınmış. Kullanılabilir
        System.out.println(test.length());

        System.out.println(str+"Ali");

        Integer sayi = null;

        // str = null  ,,, test = "";

        //System.out.println(str.isEmpty()); // null pointer exeption, olmayan bir şeyin boş olup olmadığını kontrol edemeyiz
        System.out.println(test.isEmpty()); // true

        /*
        null ataması yapılan bir variable, hiç bir method ile KULLANILAMAZ!!!

        yazdırılabilir veya + ile kullanılabilir
         */

    }
}
