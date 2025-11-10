package questao03.src;

public class App {
    public static void main(String[] args) throws InterruptedException {
        PlantContext plant = new PlantContext();

        plant.setState(new NormalOperationState());

        System.out.println("\n--- Step 1: Normal operation ---");
        plant.updateConditions(250, 1.0, 0.2, true);

        System.out.println("\n--- Step 2: Temperature rising to 320°C ---");
        plant.updateConditions(320, 1.2, 0.3, true);

        System.out.println("\n--- Step 3: Temperature rising to 410°C ---");
        Thread.sleep(31000); 
        plant.updateConditions(410, 1.3, 0.3, true);

        System.out.println("\n--- Step 4: Cooling system failure ---");
        plant.updateConditions(410, 1.4, 0.3, false);

        System.out.println("\n--- Step 5: Maintenance mode ---");
        plant.enableMaintenanceMode();
        plant.updateConditions(300, 1.0, 0.1, true);
    }
}
