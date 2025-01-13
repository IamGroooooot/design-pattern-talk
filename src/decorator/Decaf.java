package decorator;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    
    @Override
    public String getDescription() {
        return "Decaffeinated Coffee";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("4500");
    }
    
}