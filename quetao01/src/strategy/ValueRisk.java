package strategy;

import context.RiskData;

public class ValueRisk implements RiskStrategy {
    @Override
    public void calculateRisk(RiskData data) {
        System.out.println("Calculating Value at Risk (VaR)...");
        System.out.println("Portfolio value: " + data.getPortfolioValue());
        System.out.println("Result: Risk = " + (data.getPortfolioValue() * 0.05));
    }

}
