public interface TransactionProcessor {
    String authorize(String cardNumber, double amount, String currency);
}
