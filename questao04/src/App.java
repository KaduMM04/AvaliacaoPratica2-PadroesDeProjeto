public class App {
     public static void main(String[] args) {
        Document doc = new Document("<xml>NFe</xml>");
        ValidationContext context = new ValidationContext();

        // Cria cadeia de validadores
        Validator xml = new XmlSchemaValidator();
        Validator cert = new CertificateValidator();
        Validator fiscal = new FiscalRulesValidator();
        Validator db = new DataBaseValidator();
        Validator sefaz = new SefazValidator();

        xml.setNext(cert);
        cert.setNext(fiscal);
        fiscal.setNext(db);
        db.setNext(sefaz);

        xml.validate(doc, context);

        System.out.println("\n✅ Validation process finished.");
    }
}
