package strategy;

import context.RiskData;

public class ExpectedShortFall implements RiskStrategy {
    @Override
    public void calculateRisk(RiskData data) {
        System.out.println("Calculating Expected Shortfall...");
        System.out.println("Result: Risk = " + (data.getPortfolioValue() * 0.08));
    }
}