package decorator;

import java.math.BigDecimal;

public class ColdBrew extends Beverage {
    
    @Override
    public String getDescription() {
        return "Cold Brew";
    }
    
    @Override
    public BigDecimal cost() {
        return new BigDecimal("4000");
    }
    
}
