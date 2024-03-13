import java.util.Random;

public class Empleado {
<<<<<<< HEAD
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
=======
    static int numEmpleados = 0;
    Random r = new Random();


    String name = "";
    int age = 0;
    int id = 0;
    

    public Empleado(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = r.nextInt(9999, 10000);
    }
    

}
>>>>>>> c7382ef88dc5bdbfb150f1aaf726a67e0d9cf18a
