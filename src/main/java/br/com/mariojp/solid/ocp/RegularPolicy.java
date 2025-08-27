package br.com.mariojp.solid.ocp;

public class RegularPolicy implements DiscountPolicy{


    @Override
    public double apply(double amount) {
        return 0;
    }
}
