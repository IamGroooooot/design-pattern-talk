package decorator;

import java.math.BigDecimal;

public abstract class Beverage {
    
    public abstract String getDescription();
    
    public abstract BigDecimal cost();
    
    @Override
    public String toString() {
        return getDescription() + ": " + cost() + "원";
    }
    
}
