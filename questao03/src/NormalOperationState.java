package questao03.src;

public class NormalOperationState implements PlantState {

     @Override
    public void handle(PlantContext context) {
        if (context.isMaintenanceMode()) {
            context.setState(new MaintenanceState());
            return;
        }

        if (context.getTemperature() > 300) {
            context.setState(new YellowAlertState());
        } else {
            System.out.println("Normal operation. Systems stable.");
        }
    }

    @Override
    public String getName() {
        return "NORMAL_OPERATION";
    }
}
