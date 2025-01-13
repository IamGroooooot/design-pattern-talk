package decorator.condiment;

import decorator.Beverage;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {
    
    public Whip(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Whip";
    }
    
    @Override
    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal("1000"));
    }
    
}
