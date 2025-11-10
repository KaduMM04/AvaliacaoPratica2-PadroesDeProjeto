public class SefazValidator extends BaseValidator {
      @Override
    public void validate(Document doc, ValidationContext context) {
        if (!doc.isValid()) return;
        System.out.println("Consulting SEFAZ service...");
        boolean ok = true; // simulação
        if (!ok) {
            context.incrementFailure();
            if (context.isRollbackNeeded()) {
                System.out.println("⚠ Rollback: undoing database insertion...");
            }
        }
        next(doc, context);
    }
}
