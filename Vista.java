import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa que interactua
 */

public class Vista {
    private Scanner scan = new Scanner(System.in);

    /**
     * Le damos la bienvenida al usuario
     */
    public void bienvenida(){
        System.out.println("Bienvenido a la pagina de Electronica Latinoamericana");
        System.out.println("Estas son nuestras sucursales disponibles:");
    }

    /**
     * Desplegamos el menu
     * @return
     */
    public int menu(){
        System.out.println("Elija una opción:");
        System.out.println("1. Ver carrito");
        System.out.println("2. Agregar articulo a carrito");//Le damos todas las opciones disponibles
        System.out.println("3. Eliminar articulo de carrito");
        System.out.println("4. Ver articulos");
        System.out.println("5. Probar funcionalidad");
		System.out.println("6. Pagar");
        System.out.println("7. Salir/n/n");
        boolean paso = false;
        int option = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                option = Integer.parseInt(optionString);//Lo cambiamos a int
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return option;//regresamos el valor convertido
    }

    /**
     * Le preguntamos al usuario de que manera quiere ordenar el programa
     * @return
     */
    public int ordenar(){
        System.out.println("¿Como quiere ordenar la lista? (Coloque un numero de 1 a 3");
        System.out.println("(1) Fecha");
        System.out.println("(2) Precio");
        System.out.println("(3) Marca");
        boolean paso = false;
        int option = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                option = Integer.parseInt(optionString);//Lo cambiamos a int
                if (option > 0 && option < 4){
                    paso = true;
                }
                else {
                    System.out.println("Ingrese un valor entre 1 a 3");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return option;
    }

    /**
     * Le indicamos al usuario que agregue un articulo al carrito antes de pedirlo
     */
    public void agregueArticulo(){
        System.out.println("Por favor, agregue un articulo antes");
    }

    /**
     * Le pedimos el ID del articulo que quiere agregar
     * @return
     */
    public int articuloAgregar(){
        System.out.println("¿Que articulo desea agregar? (Escriba el ID por favor)");
        boolean paso = false;
        int articulo = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String articuloString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                articulo = Integer.parseInt(articuloString);//Lo cambiamos a int
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return articulo;
    }

    /**
     * Le indicamos que se agrego el articulo con exito
     */
    public void seAgrego(){
        System.out.println("El articulo se agrego con exito");
    }

    /**
     * Le indicamos que no se agrego exitosamente
     */
    public void noSeAgrego(){
        System.out.println("El articulo no se pudo agregar");
    }

    /**
     * Le pedimos el ID del articulo que quiere eliminar
     * @return
     */
    public int articuloEliminar(){
        System.out.println("¿Que articulo desea eliminar del carrito? (Escriba el ID por favor)");
        boolean paso = false;
        int articulo = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String articuloString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                articulo = Integer.parseInt(articuloString);//Lo cambiamos a int
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return articulo;
    }

    /**
     * Le indicamos que se elimino el articulo con exito
     */
    public void seElimino(){
        System.out.println("El articulo fue eliminado");
    }

    /**
     * Le indicamos que no se elimino el articulo con exito
     */
    public void noSeElimino(){
        System.out.println("El articulo no fue eliminado");
    }

    /**
     * Desplegamos todos los productos disponibles
     * @param productos
     */
    public void productos(ArrayList<Producto> productos){
        if (productos.size() != 0){
            for (int i = 0; i < productos.size(); i++){
                Producto product = productos.get(i);
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println(product.getTipo());
                System.out.println("ID: " + product.getID());
                System.out.println("Marca: "+ product.getMarca());
                System.out.println("Precio: "+ product.getPrecio());
                System.out.println("Fecha de Fabricacion: "+ product.getFechaFabricacion());
                System.out.println("-------------------------------------");
                System.out.println("");
            }
        }
        else {
            System.out.println("No hay productos en su lista");
        }
    }

    /**
     * Desplegamos todas las sucursales disponibles
     * @param sucursales
     */
    public void Sucursales(ArrayList<Sucursal> sucursales){
        if (sucursales.size() != 0){
            for (int i = 0; i < sucursales.size(); i++){
                Sucursal sucursal = sucursales.get(i);
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("ID: " + sucursal.getCodigo());
                System.out.println("Direccion: "+ sucursal.getDireccion());
                System.out.println("Ciudad: "+ sucursal.getCiudad());
                System.out.println("Pais: "+ sucursal.getPais());
                System.out.println("-------------------------------------");
                System.out.println("");
            }
        }
        else {
            System.out.println("No hay productos en su lista");
        }
    }

    /**
     * Le preguntamos que articulo le gusta probar
     * @return
     */
    public int articuloAProbar(){
        System.out.println("¿Que articulo desea probar? (Escriba el ID del articulo)");
        boolean paso = false;
        int funcion = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String funcionString = scan.nextLine();
                funcion = Integer.parseInt(funcionString);
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return funcion;
    }

    /**
     * Despliega todas las funcionalidades disponibles
     */
    public void funcionalidades(){
        System.out.println("-------------------------------------");
        System.out.println("Smartphone");
        System.out.println("Funcionalidades: ");
        System.out.println("(1) Hacen Llamadas");
        System.out.println("(2) Toman Fotos");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(5) Portabilidad");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Telefono Celular");
        System.out.println("Funcionalidades: ");
        System.out.println("(1) Hacen Llamadas");
        System.out.println("(5) Portabilidad");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Telefono Fijo");
        System.out.println("Funcionalidades: ");
        System.out.println("(1) Hacen Llamadas");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Camara Fotografica");
        System.out.println("Funcionalidades: ");
        System.out.println("(2) Toman Fotos");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(5) Portabilidad");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Desktop");
        System.out.println("Funcionalidades: ");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(6) Ejecutar Juegos");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Laptop");
        System.out.println("Funcionalidades: ");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(5) Portabilidad");
        System.out.println("(6) Ejecutar Juegos");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("SmartTV");
        System.out.println("Funcionalidades: ");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("Tablets");
        System.out.println("Funcionalidades: ");
        System.out.println("(2) Toman Fotos");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(5) Portabilidad");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("-------------------------------------");
        System.out.println("SmartWatch");
        System.out.println("Funcionalidades: ");
        System.out.println("(1) Hacen Llamadas");
        System.out.println("(2) Toman Fotos");
        System.out.println("(5) Portabilidad");
        System.out.println("-------------------------------------");
        System.out.println("");
    }

    /**
     * Le preguntamos la funcionalidad que desea probar
     * @return
     */
    public int funcionalidadAProbar(){
        System.out.println("¿Que funcionalidad desea probar? (Asegurese de que la funcionalidad elegida este disponible en el dispositivo)");
        System.out.println("(1) Hacen Llamadas");
        System.out.println("(2) Toman Fotos");
        System.out.println("(3) Navegar Internet");
        System.out.println("(4) Reproducir Videos");
        System.out.println("(5) Portabilidad");
        System.out.println("(6) Ejecutar Juegos");
        boolean paso = false;
        int funcion = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String funcionString = scan.nextLine();
                funcion = Integer.parseInt(funcionString);
                if (funcion > 0 && funcion < 7){
                    paso = true;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return funcion;
    }

    /**
     * Le pedimos los datos al usuario para la factura
     * @return
     */
    public String[] datosFactura(){
        String[] valores = new String[5];
        System.out.println("Escriba su nombre");
        valores[0] = scan.nextLine();
        System.out.println("Escriba su NIT");
        valores[1] = scan.nextLine();
        LocalDate fecha = java.time.LocalDate.now();
        valores[2] = fecha.toString();
        return valores;
    }

    /**
     * Desplegamos la factura
     * @param datos
     */
    public void finalizar(String[] datos){
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Factura No."+datos[4]);
        System.out.println("Cliente: "+ datos[0]);
        System.out.println("NIT: "+ datos[1]);
        System.out.println("Fecha: "+datos[2]);
        System.out.println("Total: $"+datos[3]+"");
    }
}
