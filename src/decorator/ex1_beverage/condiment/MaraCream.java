package decorator.ex1_beverage.condiment;

import decorator.ex1_beverage.Beverage;

import java.math.BigDecimal;

public class MaraCream extends CondimentDecorator {
    
    public MaraCream(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return super.beverage.getDescription() + " + Mara";
    }
    
    @Override
    public BigDecimal cost() {
        return super.beverage.cost().add(new BigDecimal(1000));
    }
    
}
