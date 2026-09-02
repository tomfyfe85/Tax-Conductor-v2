package com.taxconductor;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calculate {
    double gross;

    public Calculate(double gross){
        this.gross = gross;
    }

    private BigDecimal grossToBigDecimal(){
        return new BigDecimal(this.gross);
    }

    public BigDecimal tax(){
        final BigDecimal BASIC = new BigDecimal("0.20");

        BigDecimal tax = grossToBigDecimal().multiply(BASIC);
        return tax.setScale(2, RoundingMode.DOWN);
    }

//    public float net(){
//        return this.gross - tax();
//    }
}
