package com.taxconductor;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross earnings: ");
        double gross = scanner.nextDouble();
        System.out.print("Enter tax bracket, IE BASIC (20%), HIGHER_RATE (40%), or ADDITIONAL(45%): ");
        String user_bracket = scanner.next();

        Calculate calculate = new Calculate(gross, user_bracket);
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
