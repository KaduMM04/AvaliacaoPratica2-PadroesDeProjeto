import java.util.HashMap;

public class LegacyProcessorAdapter implements TransactionProcessor {
    private LegacyBankSystem legacySystem;

    public LegacyProcessorAdapter(LegacyBankSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String authorize(String cardNumber, double amount, String currency) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("cardNumber", cardNumber);
        parameters.put("amount", amount);
        parameters.put("currencyCode", convertCurrency(currency));

        // Required legacy field that doesn't exist in the modern interface
        parameters.put("originChannel", "ONLINE");

        HashMap<String, Object> response = legacySystem.processTransaction(parameters);
        return formatResponse(response);
    }

    private int convertCurrency(String currency) {
        switch (currency.toUpperCase()) {
            case "USD": return 1;
            case "EUR": return 2;
            case "BRL": return 3;
            default: return 0; // unknown currency
        }
    }

    private String formatResponse(HashMap<String, Object> response) {
        if ("OK".equals(response.get("status"))) {
            return "Authorization: " + response.get("authorizationCode") +
                   " | Message: " + response.get("message");
        } else {
            return "Failure: " + response.get("message");
        }
    }
}
