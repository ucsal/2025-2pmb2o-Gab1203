package br.com.mariojp.solid.ocp;

public class PremiumPolicy implements DiscountPolicy{


    @Override
    public double apply(double amount) {
        return 0;
    }
}
