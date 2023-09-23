
package parque_de_diversiones;


public class Atraccion {
   private String nombre;
    private double precio;
    private int boletosDisponibles;

    public Atraccion(String nombre, double precio, int boletosDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.boletosDisponibles = boletosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }
 
}
