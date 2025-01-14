package decorator.ex1_beverage;

import java.math.BigDecimal;

public class Americano extends Beverage {
    
    @Override
    public String getDescription() {
        return "Americano";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("4000");
    }
    
}
