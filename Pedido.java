import java.util.*;

public class Pedido {
    private Cliente cliente;
    private List<Platillo> platillos;
    private double total;

    public Pedido() {
        platillos = new ArrayList<>();
    }

    public Pedido(Cliente cliente, List<Platillo> platillos) {
        this.cliente = cliente;
        this.platillos = platillos;
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (Platillo platillo : platillos) {
            total += platillo.getPrecio();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }
}