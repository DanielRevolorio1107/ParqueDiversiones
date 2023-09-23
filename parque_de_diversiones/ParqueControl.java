
package parque_de_diversiones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dania
 */
public class ParqueControl {
    private List<Atraccion> atracciones;

    public ParqueControl() {
        atracciones = new ArrayList<>();
    }

    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void venderBoletos(String nombreAtraccion, int cantidad) {
        Atraccion atraccion = buscarAtraccion(nombreAtraccion);
        if (atraccion != null) {
            if (cantidad <= atraccion.getBoletosDisponibles()) {
                atraccion.setBoletosDisponibles(atraccion.getBoletosDisponibles() - cantidad);
                System.out.println("Se vendieron " + cantidad + " boletos para " + nombreAtraccion);
            } else {
                System.out.println("No hay suficientes boletos disponibles para " + nombreAtraccion);
            }
        } else {
            System.out.println("No se encontró la atracción " + nombreAtraccion);
        }
    }

    private Atraccion buscarAtraccion(String nombre) {
        for (Atraccion atraccion : atracciones) {
            if (atraccion.getNombre().equals(nombre)) {
                return atraccion;
            }
        }
        return null;
    }
}


