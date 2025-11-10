package questao03.src;

public class YellowAlertState implements PlantState {
    private long startTime = System.currentTimeMillis();

    @Override
    public void handle(PlantContext context) {
        if (context.isMaintenanceMode()) {
            context.setState(new MaintenanceState());
            return;
        }

        if (context.getTemperature() > 400 && (System.currentTimeMillis() - startTime) > 30000) {
            context.setState(new RedAlertState());
        } else if (context.getTemperature() <= 300) {
            context.setState(new NormalOperationState());
        } else {
            System.out.println("Yellow Alert: Monitoring temperature rise...");
        }
    }

    @Override
    public String getName() {
        return "YELLOW_ALERT";
    }
}
