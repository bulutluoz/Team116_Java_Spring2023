package day21_dateTime_varargs;

public class C09_Varargs {
    public static void main(String[] args) {

        // son elementi ayirabilecegimiz bir method olusturalim

        islemYap(3,4);
    }

    public static void islemYap(int... bastakiSayilar){ //, String sonElement
      // varargs eleman alirken sinir tanimadigi icin, ne kadar eleman varsa almaya calisir
      // kendisinden sonraki parametrelere eleman birakmaz
      // Bundan dolayi bir method'da parametre olarak Varargs kullanilacaksa
      // EN SONDA KULLANILMALIDIR

      // Bu mantikla bir method'da birden fazla VARARGS KULLANILAMAZ

    }


}
