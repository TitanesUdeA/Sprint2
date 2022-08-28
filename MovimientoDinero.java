public class MovimientoDinero {

    private int id;
    private String concept;
    private float amount;
    private String user;


    public MovimientoDinero(int id, String concept, float amount, String user) {

        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
