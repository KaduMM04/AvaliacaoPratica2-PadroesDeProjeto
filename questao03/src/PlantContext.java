package questao03.src;

public class PlantContext {
    private PlantState currentState;
    private double temperature;
    private double pressure;
    private double radiationLevel;
    private boolean coolingSystemOk = true;
    private boolean maintenanceMode = false;

    public PlantContext() {
        this.currentState = new OffState();
    }

    public void setState(PlantState state) {
        this.currentState = state;
        System.out.println("Plant state changed to: " + state.getName());
    }

    public void updateConditions(double temperature, double pressure, double radiationLevel, boolean coolingSystemOk) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.radiationLevel = radiationLevel;
        this.coolingSystemOk = coolingSystemOk;
        currentState.handle(this);
    }

    public void enableMaintenanceMode() {
        this.maintenanceMode = true;
        setState(new MaintenanceState());
    }

    public void disableMaintenanceMode() {
        this.maintenanceMode = false;
        setState(new NormalOperationState());
    }

    public double getTemperature() { return temperature; }
    public boolean isCoolingSystemOk() { return coolingSystemOk; }
    public boolean isMaintenanceMode() { return maintenanceMode; }
}