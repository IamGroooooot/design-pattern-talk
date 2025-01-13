package decorator;

import decorator.condiment.Ice;
import decorator.condiment.IceCream;
import decorator.condiment.Whip;

public class Customer {
    
    public static void main(String[] args) {
        // Hazelnut 주문
        Beverage b = new Hazelnut();
        System.out.println(b);
        // 토핑 추가
        b = new Ice(b); // Ice 추가
        b = new Whip(b); // Whip 추가
        System.out.println(b);
        System.out.println();
        
        // Espresso + IceCream + Whip 주문
        Beverage b2 = new Whip(new IceCream(new Espresso()));
        System.out.println(b2);
        
    }
    
}
