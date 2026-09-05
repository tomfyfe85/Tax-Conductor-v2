package com.taxconductor;
import java.math.BigDecimal;

public enum TaxBracket {
    BASIC(0.2f),
    HIGHER_RATE(0.4f),
    ADDITIONAL(0.45f);

    private final float bracket;

    TaxBracket(float bracket){
        this.bracket = bracket;
    }

    public BigDecimal getBracket(){
        return new BigDecimal(bracket);
    }
}
