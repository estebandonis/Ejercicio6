import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Clase donde se ejecutan todos los modulos
 */

public class Controlador{
    /**
     * Es donde se ejecuta el programa completo
     * @param args
     */
    public static void main(String[] args) {
        Sistema sistem = new Sistema();
        Vista vista = new Vista();
        int opcion = 0;
        vista.bienvenida();
        sistem.datosProductos();
        sistem.datosSucursales();
        vista.Sucursales(sistem.getSucursales());
        while (opcion != 7){
            opcion = vista.menu();
            if (opcion == 1){
                int ordenar = vista.ordenar();
                if (ordenar == 1){
                    ArrayList<Producto> carrito = sistem.getCarrito();
                    Collections.sort(carrito);
                    vista.productos(carrito);
                }
                else if (ordenar == 2){
                    ArrayList<Producto> carrito = sistem.getCarrito();
                    Collections.sort(carrito, new Comparator<Producto>() {
                        @Override
                        public int compare(Producto o1, Producto o2) {
                            if (o1.getPrecio() < o2.getPrecio()) return 1;
                            if (o1.getPrecio() > o2.getPrecio()) return -1;
                            else return 0;
                        }
                    });
                    vista.productos(carrito);
                }
                else if (ordenar == 3){
                    ArrayList<Producto> carrito = sistem.getCarrito();
                    Collections.sort(carrito, new Comparator<Producto>() {
                        @Override
                        public int compare(Producto o1, Producto o2) {
                            if (o1.getMarca().equalsIgnoreCase(o2.getMarca())) return 0;
                            else return 1;
                        }
                    });
                    vista.productos(carrito);
                }
            }
            else if (opcion == 2){
                boolean seAgrego = sistem.agregarArticuloCarrito(vista.articuloAgregar());
                if (seAgrego == true){
                    vista.seAgrego();
                }
                else{
                    vista.noSeAgrego();
                }
            }
            else if (opcion == 3){
                boolean seElimino = sistem.eliminarArticuloCarrito(vista.articuloEliminar());
                if (seElimino == true){
                    vista.seElimino();
                }
                else{
                    vista.noSeElimino();
                }
            }
            else if (opcion == 4){
                vista.productos(sistem.getProductos());
            }
            else if (opcion == 5){
                vista.funcionalidades();
                int funcion = vista.funcionalidadAProbar();
                int articulo = vista.articuloAProbar();
                sistem.ejecutarFuncionalidad(funcion, articulo);
            }
            else if (opcion == 6){
                Random rand = new Random();
                String[] datos = vista.datosFactura();
                Double total = sistem.Total();
                datos[3] = Double.toString(total);
                int randint = rand.nextInt((500 - 300) + 1) + 300;
                datos[4] = Integer.toString(randint);
                vista.finalizar(datos);
                System.exit(0);
            }
            else if (opcion == 7){
                System.exit(0);//Se sale del programa
            }
            else{
                System.out.println("Elija una opcion valida");
            }
        }
    }
}