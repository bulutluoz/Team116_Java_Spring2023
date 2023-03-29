package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C04_SwitchStatement {
    public static void main(String[] args) {
        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaziyla goruntulemek istediginiz tam sayiyi giriniz:");

        int girilenSayi = scanner.nextInt();

        if ( girilenSayi<-99 || ( girilenSayi>-10 && girilenSayi<10) || girilenSayi>100)
            System.out.println("Iki basamakli bir tam sayi girmediniz.");

        else {
            if (girilenSayi<0) {
                System.out.print("Eksi");
                girilenSayi*=-1;
            }
            switch (girilenSayi/10) {
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (girilenSayi%10) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
            }
        }
    }
    }

