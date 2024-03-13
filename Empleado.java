public class Empleado {
    private String nombre;
    private double salario;
    private String rol;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, String rol) {
        this.nombre = nombre;
        this.salario = salario;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}