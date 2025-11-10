package questao03.src;

public class EmergencyState implements PlantState {

    @Override
    public void handle(PlantContext context) {
        if (context.isMaintenanceMode()) {
            context.setState(new MaintenanceState());
            return;
        }

        System.out.println("EMERGENCY: Immediate action required! Cooling system failure.");
    }

    @Override
    public String getName() {
        return "EMERGENCY";
    }

}
