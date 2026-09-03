package com.taxconductor;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross earnings: ");

        Calculate calculate = new Calculate(scanner.nextFloat());
        String tax = calculate.tax().toPlainString();
        String net = calculate.net().toPlainString();

        System.out.print("Tax: " + tax + ", Net profit: " + net);
    }
}


//        TODO:
//        get tax bracket - use enum?
//        Add some validation.
//        Expenses
//        AI expenses query feature
//        Make interface for different tax years/tax codes ?
