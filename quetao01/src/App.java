import strategy.StressTesting;
import strategy.ValueRisk;
import context.RiskContext;
import context.RiskData;
import strategy.ExpectedShortFall;

public class App {
    public static void main(String[] args) {
        RiskData data = new RiskData(10000, 0.2, 0.95);
        RiskContext context = new RiskContext();

        // Estratégia 1
        context.setStrategy(new ValueRisk());
        context.executeStrategy(data);

        System.out.println("---------------------------");

        // Estratégia 2
        context.setStrategy(new ExpectedShortFall());
        context.executeStrategy(data);

        System.out.println("---------------------------");

        // Estratégia 3
        context.setStrategy(new StressTesting());
        context.executeStrategy(data);
    }
}
