package decorator.condiment;

import decorator.Beverage;

import java.math.BigDecimal;

public class Choco extends CondimentDecorator {
    
    public Choco(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Choco";
    }
    
    @Override
    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal("2000"));
    }
    
}
