import java.util.ArrayList;

public class Restaurante {
    private ArrayList <Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList <Platillo> platillos = new ArrayList<Platillo>();

    private String name = "";


    public void registrarCliente(String name){

    }

    public void registrarPlatillo(String name, double precio){
        Platillo platillo = new Platillo(name, precio);
        platillos.add(platillo);
    }


}
