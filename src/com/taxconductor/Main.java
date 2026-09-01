package com.taxconductor;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross earnings: ");

        final float BASIC = .2F;

        float gross = scanner.nextFloat();
        float tax = gross * BASIC;
        float net = gross - tax;

        System.out.printf("Tax: %f,\nNet profit: %f\n", tax, net);

//        TODO: round down tax and net
//             abstract calculation to calculator class, get tax bracket
//             from the user as an argument. Add validation.
    }
}