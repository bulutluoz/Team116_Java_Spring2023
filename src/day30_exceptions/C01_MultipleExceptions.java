package day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args)  {


        try {
            // erisim
            FileInputStream fis = new FileInputStream("src/day29_exceptions/deneme.txt");
            //okuma
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) { // erisim

            System.out.println("Dosya yolu hatali, dosyaya erisilemedi");

        } catch (IOException e) { // erisim ve okuma

            System.out.println("Dosyaya erisim ve okuma ile ilgili bir hata var");
        }

    }
}
