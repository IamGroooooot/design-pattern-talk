package decorator.ex1_beverage;

import java.math.BigDecimal;

public class Hazelnut extends Beverage {
    
    @Override
    public String getDescription() {
        return "Hazelnut";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("4500");
    }
    
}