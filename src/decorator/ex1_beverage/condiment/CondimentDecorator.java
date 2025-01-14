package decorator.ex1_beverage.condiment;

import decorator.ex1_beverage.Beverage;


public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage beverage;
    
    protected CondimentDecorator(Beverage beverage) {this.beverage = beverage;}
    
}
