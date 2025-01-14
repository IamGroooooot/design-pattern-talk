package decorator.ex1_beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    
    @Override
    public String getDescription() {
        return "Espresso";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("2000");
    }
    
}
