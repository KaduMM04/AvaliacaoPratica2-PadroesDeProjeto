public class App {
    public static void main(String[] args) {
        LegacyBankSystem legacySystem = new LegacyBankSystem();
        TransactionProcessor processor = new LegacyProcessorAdapter(legacySystem);

        System.out.println("--- Test 1: Valid transaction ---");
        String response1 = processor.authorize("1234-5678-9999-0000", 250.0, "BRL");
        System.out.println(response1);

        System.out.println("\n--- Test 2: Invalid currency ---");
        String response2 = processor.authorize("9999-0000-8888-7777", 100.0, "ABC");
        System.out.println(response2);
    }
}
