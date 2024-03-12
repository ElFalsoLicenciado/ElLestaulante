import java.util.Random;

public class Empleado {
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
