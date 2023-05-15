package day29_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Java'da dosya okuma ve yazma ile ilgili exception'lar
            (IOException ==> Input-Output Exception)
            Compile time'da devreye girip
            bizi uyarir

            Java ile bilgisayarimizdaki bir dosyaya ulasmak isterseniz
            dosya yoluna ihtiyacimiz olur

            Dosya yolunu String olarak kaydettikten sonra
            FileInputStream class'indan olusturacagimiz obje ile
            istedigimiz dosyaya erisebiliriz

            Input-Output islemi yapmak istedigimizde
            Java ulasmak istedigimiz dosyanin
            dosya yolunun dogru oldugundan
            yani o konumda bir dosya bulundugundan
            ve dosyanin kullanilabilir oldugundan emin olmak ister

            bir checked exception olustugunda
            2 sekilde bu KIRMIZI CIZGI giderilebilir

            1- exception'i try catch ile handle edebilirsiniz
               yani exception olussa bile calismaya devam etmesini saglayabilirsiniz

            2- Ben dosya yolundan eminim
               calismaya devam et, exception olusursa olussun
               diyebilirsiniz.
               Bunun icin method signature'na
               throws FileNotFoundException   aciklamasi eklenir.

         */

        String dosyaYolu= "src/day29_exceptions/deneme.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);

    }
}
