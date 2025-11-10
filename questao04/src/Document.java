public class Document {
    private String xml;
    private boolean valid = true;

    public Document(String xml) {
        this.xml = xml;
    }

    public String getXml() {
        return xml;
    }

    public boolean isValid() {
        return valid;
    }

    public void invalidate() {
        this.valid = false;
    }
}
