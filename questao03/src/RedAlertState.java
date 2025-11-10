package questao03.src;

public class RedAlertState implements PlantState {
    @Override
    public void handle(PlantContext context) {
        if (context.isMaintenanceMode()) {
            context.setState(new MaintenanceState());
            return;
        }

        if (!context.isCoolingSystemOk()) {
            context.setState(new EmergencyState());
        } else if (context.getTemperature() <= 400) {
            context.setState(new YellowAlertState());
        } else {
            System.out.println("Red Alert: Cooling system under heavy load.");
        }
    }

    @Override
    public String getName() {
        return "RED_ALERT";
    }
}
