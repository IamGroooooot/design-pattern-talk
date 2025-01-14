package decorator.ex1_beverage.condiment;

import decorator.ex1_beverage.Beverage;

import java.math.BigDecimal;

public class Ice extends CondimentDecorator {
    
    public Ice(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Ice";
    }
    
    @Override
    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal("500"));
    }
    
}
