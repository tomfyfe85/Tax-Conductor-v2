package com.taxconductor;
import java.math.BigDecimal;

public enum TaxBracket {
    BASIC(new BigDecimal("0.2")),
    HIGHER_RATE(new BigDecimal("0.4")),
    ADDITIONAL(new BigDecimal("0.45"));

    private final BigDecimal bracket;

    TaxBracket(BigDecimal bracket){
        this.bracket = bracket;
    }

    public BigDecimal getBracket(){
        return new BigDecimal(String.valueOf(this.bracket));
    }
}
