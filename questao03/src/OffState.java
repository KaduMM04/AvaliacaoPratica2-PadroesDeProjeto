package questao03.src;

public class OffState implements PlantState {

    @Override
    public void handle(PlantContext context) {
        if (context.isMaintenanceMode()) {
            context.setState(new MaintenanceState());
        } else {
            System.out.println("Plant is off. Waiting for activation...");
        }
    }

    @Override
    public String getName() {
        return "OFF";
    }
}
