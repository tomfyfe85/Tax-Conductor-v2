package com.taxconductor;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross earnings: ");

        Calculate calculate = new Calculate(scanner.nextFloat());

        System.out.print("Tax: " + calculate.tax().toPlainString());

//        System.out.printf("Tax: %f,\nNet profit: %f\n", calculate.tax(), calculate.net());
//        TODO: round down tax and net - Calculate needs to use BigDecimal

//
//             get tax bracket
//             from the user as an argument. Add validation.
    }
}