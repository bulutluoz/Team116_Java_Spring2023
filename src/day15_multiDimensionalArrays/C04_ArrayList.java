package day15_multiDimensionalArrays;

import day14_arrays.C10_KullancidanAldigimizDegeriArrayeEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        // Array uzunlugu degistirilemedigi icin calisma ortaminda pek tercih edilmez
        // Java ekleme ve silme yapabilecegimiz bir yapi olusturmustur
        // ArrayList, Array altyapisini kullanir ama uzunluk acisindan esnektir.

        // asagidaki arr'e element olarak 10'u ekleyelim

        int[] arr = {3,5,6};

        arr = C10_KullancidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);
        arr = C10_KullancidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);
        arr = C10_KullancidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);
        arr = C10_KullancidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);

        System.out.println(Arrays.toString(arr));

        // Bir ArrayList olusturmak istersek
        List<Integer> sayilar = new ArrayList<>();

        // ArrayList'in tek dezavantaji elementleri tek tek eklemek zorunda olmamizdir
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        System.out.println(sayilar); //



    }
}
