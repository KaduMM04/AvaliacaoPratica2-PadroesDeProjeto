
public abstract class BaseValidator implements Validator {
     protected Validator next;

    @Override
    public void setNext(Validator next) {
        this.next = next;
    }

    protected void next(Document doc, ValidationContext context) {
        if (next != null && context.getFailureCount() < 3) {
            next.validate(doc, context);
        } else if (context.getFailureCount() >= 3) {
            System.out.println("⚠ Circuit breaker triggered. Validation stopped.");
        }
    }
}
