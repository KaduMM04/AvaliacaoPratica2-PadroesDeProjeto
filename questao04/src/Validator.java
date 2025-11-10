public interface Validator {
    void setNext(Validator next);
    void validate(Document doc, ValidationContext context);
}
