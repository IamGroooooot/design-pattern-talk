package decorator.condiment;

import decorator.Beverage;

import java.math.BigDecimal;

public class IceCream extends CondimentDecorator {
    
    public IceCream(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + IceCream";
    }
    
    @Override
    public BigDecimal cost() {
        return this.beverage.cost().add(new BigDecimal("3000"));
    }
}
