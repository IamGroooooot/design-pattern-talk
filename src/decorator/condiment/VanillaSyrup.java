package decorator.condiment;

import decorator.Beverage;

import java.math.BigDecimal;

public class VanillaSyrup extends CondimentDecorator {
    
    public VanillaSyrup(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Vanilla Syrup";
    }
    
    @Override
    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal("1000"));
    }
    
}
