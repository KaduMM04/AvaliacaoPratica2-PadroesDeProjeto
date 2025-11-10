public class XmlSchemaValidator extends BaseValidator {
    @Override
    public void validate(Document doc, ValidationContext context) {
        System.out.println("Validating XML Schema...");
        boolean ok = true; // simulação
        if (!ok) {
            context.incrementFailure();
            doc.invalidate();
            System.out.println("❌ XML Schema validation failed.");
        }
        next(doc, context);
    }
}
