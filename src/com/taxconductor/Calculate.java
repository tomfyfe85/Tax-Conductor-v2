package com.taxconductor;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculate {
    private final String user_bracket;
    BigDecimal gross;

    public Calculate(BigDecimal gross, String userBracket) {
        this.gross = gross; this.user_bracket = userBracket;
    }

    public BigDecimal tax() {
        TaxBracket currentTaxBracket = TaxBracket.valueOf(this.user_bracket.toUpperCase());

        BigDecimal tax = this.gross.multiply(currentTaxBracket.getBracket());
        return tax.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal net() {
        return this.gross.subtract(tax());
    }
}

