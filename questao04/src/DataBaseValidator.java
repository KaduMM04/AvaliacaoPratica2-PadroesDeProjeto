public class DataBaseValidator extends BaseValidator {
    @Override
    public void validate(Document doc, ValidationContext context) {
        System.out.println("Checking database for duplicates...");
        boolean ok = true;
        if (!ok) {
            context.incrementFailure();
            context.setRollbackNeeded(true);
            System.out.println("❌ Duplicated document detected!");
        }
        next(doc, context);
    }
}