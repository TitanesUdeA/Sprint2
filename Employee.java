import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String email;
    private Enterprise enterprise;
    private Rol rol;
    private Date updatedAt;
    private Date createdAt;

    enum Rol{
        operativo, administrador;
    }

    public Employee(int id, String name, String email, Enterprise enterprise, Rol rol, Date updatedAt, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.rol = rol;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
