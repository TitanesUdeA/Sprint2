public class MovimientoDinero {

    private int id;
    private String concept;
    private float amount;

    public MovimientoDinero(int id, String concept, float amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
