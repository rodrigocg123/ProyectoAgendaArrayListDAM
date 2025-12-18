package main;

public class Contactos {

    private String nombre;
    private String email;
    private int telefono;

    // Constructor sin parámetros
    public Contactos() {
        this.nombre = "";
        this.email = "";
        this.telefono = 0;
    }

    // Constructor con parámetros
    public Contactos(String nombre, String email, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para teléfono
    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String mostrarInfo() {
        return "Contactos{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
