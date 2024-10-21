package Ejercicio4;

public class Employee {
    String nombreApellido;
    int edad;
    double salario;

    public Employee() {
    }

    public Employee(String nombreApellido, int edad, double salario) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nombreApellido='" + nombreApellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
