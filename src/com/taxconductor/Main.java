package com.taxconductor;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross earnings: ");
        BigDecimal gross = scanner.nextBigDecimal();

        System.out.print("Enter tax bracket, IE BASIC (20%), HIGHER_RATE (40%), or ADDITIONAL(45%): ");
        String userBracket = scanner.next();

        Calculate calculate = new Calculate(gross, userBracket);
        String tax = calculate.tax().toPlainString();
        String net = calculate.net().toPlainString();

        System.out.print("Tax: " + tax + ", Net profit: " + net);
    }
}


//        TODO:
//        Add some validation.
//        Expenses
//        AI expenses query feature
//        Make interface for different tax years/tax codes ?
