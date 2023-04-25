package day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {

        LocalDate dogumtarihi= LocalDate.of(1995,6,8);
        LocalDate bugun= LocalDate.now();

        Period yasEnes = Period.between(dogumtarihi,bugun);
        System.out.println(yasEnes); // P 27Y 10M 17D

        System.out.println("Enes'in yasi : "+yasEnes.getYears());


    }
}
