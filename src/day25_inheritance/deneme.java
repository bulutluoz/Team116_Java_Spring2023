package day25_inheritance;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        petType();
    }


    public static void petType() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please choose appropriate options below \n"+
                "If your pet is dog, please enter 1\n"+
                "If your pet is cat, please enter 2\n"+
                "If you have any other type of pet,please enter 3");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                scanner= new Scanner(System.in);
                System.out.println("Can you type your dog' breed? :");
                String dogBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+dogBreed+" !!  :)" );
                break;
            case 2:
                System.out.println("Can you type your cat' breed? :");
                String catBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+catBreed+" !!  :)" );
                break;
            case 3:
                System.out.println("Please enter kinds of your pet? :");
                String otherBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+otherBreed+" !!  :)" );
                break;
            default:
                System.out.println("Invalid pet number.");
        }
    }
}
