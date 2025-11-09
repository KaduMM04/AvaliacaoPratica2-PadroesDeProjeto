package strategy;

import context.RiskData;

public class StressTesting implements RiskStrategy {
    @Override
    public void calculateRisk(RiskData data) {
        System.out.println("Performing Stress Testing...");
        System.out.println("Result: Risk = " + (data.getPortfolioValue() * 0.12));
    }
}
