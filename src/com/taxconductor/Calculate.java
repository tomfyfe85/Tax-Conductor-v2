package com.taxconductor;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calculate {
    float gross;

    public Calculate(float gross){
        this.gross = gross;
    }

    private BigDecimal grossToBigDecimal(){
        BigDecimal gross_amount;
        gross_amount = new BigDecimal(this.gross);
        return gross_amount;
    }

    public BigDecimal tax(){
        final float BASIC = .2F;
        BigDecimal tax;
        tax = grossToBigDecimal() * BASIC;
        return tax;
    }

    public float net(){
        return this.gross - tax();
    }
}
