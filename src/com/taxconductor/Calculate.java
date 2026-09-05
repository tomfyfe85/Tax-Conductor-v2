package com.taxconductor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;


public class Calculate {
    private final String user_bracket;
    double gross;

    public Calculate(double gross, String user_bracket) {
        this.gross = gross; this.user_bracket = user_bracket;
    }

    private BigDecimal grossToBigDecimal() {
        BigDecimal gross = new BigDecimal(this.gross);
        return gross.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal tax() {
        TaxBracket currentTaxBracket = TaxBracket.valueOf(this.user_bracket.toUpperCase());


        BigDecimal tax = grossToBigDecimal().multiply(currentTaxBracket.getBracket());
        return tax.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal net() {
        return grossToBigDecimal().subtract(tax());
    }
}

