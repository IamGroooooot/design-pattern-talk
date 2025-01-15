package decorator.ex1_beverage.condiment;

import decorator.ex1_beverage.Beverage;

import java.math.BigDecimal;


public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage beverage;
    
    protected CondimentDecorator(Beverage beverage) {this.beverage = beverage;}
    
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
    
    @Override
    public BigDecimal cost() {
        return beverage.cost();
    }
    
}
