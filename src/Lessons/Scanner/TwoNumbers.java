package Lessons.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();

        input.close();
        System.out.println("A + B = " + (a + b));

        //        Scanner input = new Scanner(System.in);
//
//        System.out.println("Podaj A: ");
//        double a = input.nextDouble();
//        System.out.println("Podaj B: ");
//        double b = input.nextDouble();
//
//        input.close();
//        System.out.println("A + B = " + (a + b));
    }







}
