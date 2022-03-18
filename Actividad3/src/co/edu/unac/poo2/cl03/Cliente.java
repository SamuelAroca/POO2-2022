package co.edu.unac.poo2.cl03;

public class Cliente {
    
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private long nroTelefono;

    public Cliente(long id, String nombre, String apellido, String email, long nroTelefono) {
        this.setId(id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.setNroTelefono(nroTelefono);
    }

    public long getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(long nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
