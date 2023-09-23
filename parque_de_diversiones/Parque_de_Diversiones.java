
package parque_de_diversiones;

import java.util.List;


public class Parque_de_Diversiones {

    
    public static void main(String[] args) {
        ParqueControl parque = new ParqueControl();

        // Agregar atracciones al parque
        parque.agregarAtraccion(new Atraccion("Montaña Rusa", 10.0, 50));
        parque.agregarAtraccion(new Atraccion("Carrusel", 5.0, 100));
        parque.agregarAtraccion(new Atraccion("Sillas Voladoras", 8.0, 30));

        // Vender boletos
        parque.venderBoletos("Montaña Rusa", 2);
        parque.venderBoletos("Carrusel", 4);
        parque.venderBoletos("Sillas Voladoras", 1);
        parque.venderBoletos("Sillas Voladoras", 50);

        // Obtener información de las atracciones
        List<Atraccion> atracciones = parque.getAtracciones();
        for (Atraccion atraccion : atracciones) {
            System.out.println("Atracción: " + atraccion.getNombre());
            System.out.println("Precio: $" + atraccion.getPrecio());
            System.out.println("Boletos disponibles: " + atraccion.getBoletosDisponibles());
            System.out.println("------------------------------");
        }
    }
}
    
    

