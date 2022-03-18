public class CLiente {

    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private long nroTelefono;

    public CLiente(long id, String nombre, String apellido, String email, long nroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nroTelefono = nroTelefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(long nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
}
