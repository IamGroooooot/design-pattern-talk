package decorator.ex1_beverage;

import java.math.BigDecimal;

public class Tea extends Beverage {
    
    @Override
    public String getDescription() {
        return "Default Tea";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("3000");
    }
    
}
