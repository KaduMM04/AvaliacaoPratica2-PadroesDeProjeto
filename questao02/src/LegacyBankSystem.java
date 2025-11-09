import java.util.HashMap;

public class LegacyBankSystem {
      public HashMap<String, Object> processTransaction(HashMap<String, Object> parameters) {
        HashMap<String, Object> response = new HashMap<>();

        if (!parameters.containsKey("currencyCode")) {
            response.put("status", "ERROR");
            response.put("message", "Field 'currencyCode' is required in the legacy system.");
            return response;
        }

        response.put("status", "OK");
        response.put("authorizationCode", "LEG-" + Math.round(Math.random() * 10000));
        response.put("message", "Transaction successfully processed in the legacy system.");
        return response;
    }
    
}
