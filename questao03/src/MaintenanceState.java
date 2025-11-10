package questao03.src;

public class MaintenanceState implements PlantState {

     @Override
    public void handle(PlantContext context) {
        System.out.println("Maintenance mode active. All alerts and operations paused.");
    }

    @Override
    public String getName() {
        return "MAINTENANCE";
    }

}
