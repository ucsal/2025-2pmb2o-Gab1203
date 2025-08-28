package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator{

    private Map<CustomerType, DiscountPolicy> policyMap;

    public DiscountCalculator(){

        policyMap =  new HashMap<>();
        policyMap.put(CustomerType.REGULAR, new RegularPolicy());
        policyMap.put(CustomerType.PREMIUM, new PremiumPolicy());
        policyMap.put(CustomerType.PARTNER, new PartnerPolicy());

    }

    public DiscountCalculator(Map<CustomerType, DiscountPolicy> policyMap){
        this.policyMap = policyMap;
    }

    public double apply(double amount, CustomerType type){
        DiscountPolicy policy = policyMap.get(type);
        return policy.apply(amount);
    }
}
