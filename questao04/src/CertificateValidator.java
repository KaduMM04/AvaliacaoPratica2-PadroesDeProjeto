public class CertificateValidator extends BaseValidator {
    @Override
    public void validate(Document doc, ValidationContext context) {
        System.out.println("Validating Certificate...");
        boolean ok = true; // simulação
        if (!ok) {
            context.incrementFailure();
            doc.invalidate();
            System.out.println("❌ Certificate validation failed.");
        }
        next(doc, context);
    }

}
