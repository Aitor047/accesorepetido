package Ejercicio1;

public class Fruta {
    private String nombre;
    private String color;

    public Fruta(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public Fruta() {
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
