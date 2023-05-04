public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nom, String dir, String tel, String email) {
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tel;
        this.email = email;
    }
}
