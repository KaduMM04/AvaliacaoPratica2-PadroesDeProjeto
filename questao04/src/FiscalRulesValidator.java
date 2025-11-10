public class FiscalRulesValidator extends BaseValidator {
     @Override
    public void validate(Document doc, ValidationContext context) {
        if (!doc.isValid()) return;
        System.out.println("Validating fiscal rules...");
        boolean ok = true;
        if (!ok) {
            context.incrementFailure();
            doc.invalidate();
        }
        next(doc, context);
    }
}
