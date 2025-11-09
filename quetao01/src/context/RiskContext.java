package context;

import strategy.RiskStrategy;

public class RiskContext {
    private RiskStrategy strategy;

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(RiskData data) {
        if (strategy == null) {
            System.out.println("No strategy selected!");
        } else {
            strategy.calculateRisk(data);
        }
    }
}
