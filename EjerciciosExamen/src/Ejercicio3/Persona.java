package Ejercicio3;

public class Persona {
    private String nombre;
    private int id;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
