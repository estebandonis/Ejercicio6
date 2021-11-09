import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Programa donde se maneja la logica del programa
 */

public class Sistema {
    private ArrayList<Sucursal> Sucursales = new ArrayList<Sucursal>();
    private ArrayList<Producto> Productos = new ArrayList<Producto>();
    private ArrayList<Producto> carrito = new ArrayList<Producto>();
    private int numProducto = 1;

    /**
     * Extraemos los datos de los archivos
     */
    public void datosProductos(){
        String pathActual = "Productos.csv";//Establecemos la ruta
        String line = "";
        int contador = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathActual));//Leemos el documento

            while((line = br.readLine()) != null){//Recorremos todas las lineas
                String[] values = line.split(",");
                String tipo = values[0];
                if (tipo.equalsIgnoreCase("Smartphone")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    Smartphone product = new Smartphone(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("TelefonoCelular")) {
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    TelefonoCelular product = new TelefonoCelular(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("TelefonoFijo")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    TelefonoFijo product = new TelefonoFijo(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }                
                else if (tipo.equalsIgnoreCase("CamaraFotografica")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    CamaraFotografica product = new CamaraFotografica(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("Desktop")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    Desktop product = new Desktop(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("Laptop")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    Laptop product = new Laptop(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("SmartTV")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    SmartTV product = new SmartTV(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("Tablets")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    Tablets product = new Tablets(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
                else if (tipo.equalsIgnoreCase("SmartWatch")){
                    double precio = Double.parseDouble(values[1]);
                    String serie = values[2];
                    String marca = values[3];
                    int dia = Integer.parseInt(values[4]);
                    int mes = Integer.parseInt(values[5]);
                    int year = Integer.parseInt(values[6]); 
                    LocalDate fechaFabricacion = java.time.LocalDate.of(year, mes, dia);

                    SmartWatch product = new SmartWatch(contador, precio, serie, marca, fechaFabricacion);
                    Productos.add(product);
                    contador += 1;
                }
            } 
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No funciono");
        } catch (IOException e) {
            System.out.println("No funciono");
        }
    }

    /**
     * Extraemos los datos de los archivos
     */
    public void datosSucursales(){
        String pathActual = "Sucursales.csv";//Establecemos la ruta
        String line = "";
        int contador = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathActual));//Leemos el documento

            while((line = br.readLine()) != null){//Recorremos todas las lineas
                String[] values = line.split(",");
                
                String direccion = values[0];
                String ciudad = values[1];
                String pais = values[2];

                Sucursal sucur = new Sucursal(contador, direccion, ciudad, pais);
                Sucursales.add(sucur);
                contador += 1;
            } 
            br.close();             
        } catch (FileNotFoundException e) {
            System.out.println("No funciono");
        } catch (IOException e) {
            System.out.println("No funciono");
        }
    }

    /**
     * Agregamos un articulo al carrito
     * @param codigo
     * @return
     */
    public boolean agregarArticuloCarrito(int codigo){
        boolean agregado = false;
        for (int i = 0; i < Productos.size(); i++){
            Producto product = Productos.get(i);
            int code = product.getID();
            if (code == codigo){
                carrito.add(product);
                agregado = true;
            }
        }
        return agregado;
    }

    /**
     * Eliminamos un articulo del carrito
     */
    public boolean eliminarArticuloCarrito(int codigo){
        boolean eliminado = false;
        for (int a = 0; a < carrito.size(); a++){
            Producto product = Productos.get(a);
            int code = product.getID();
            if (code == codigo){
                carrito.remove(product);
                eliminado = true;
            }
        }
        return eliminado;
    }

    /**
     * Ejecutamos la funcionalidad que el usuario desea
     * @param funcion
     * @param id
     */
    public void ejecutarFuncionalidad(int funcion, int id){
        boolean paso = false;
        for (int e = 0; e < Productos.size(); e++){
            Producto producto = Productos.get(e);
            if (producto.getID() == id){
                String tipo = producto.getTipo();
                if (tipo.equalsIgnoreCase("Smartphone")){
                    Smartphone product = (Smartphone) producto;
                    if (funcion == 1){
                        product.llamar();
                    }
                    else if (funcion == 2){
                        product.tomarFoto();
                    }
                    else if (funcion == 3){
                        product.navegar();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("TelefonoCelular")) {
                    TelefonoCelular product = (TelefonoCelular) producto;
                    if (funcion == 1){
                        product.llamar();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else {
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("TelefonoFijo")){
                    TelefonoFijo product = (TelefonoFijo) producto;
                    if (funcion == 1){
                        product.llamar();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }                
                else if (tipo.equalsIgnoreCase("CamaraFotografica")){
                    CamaraFotografica product = (CamaraFotografica) producto;
                    if (funcion == 2){
                        product.tomarFoto();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("Desktop")){
                    Desktop product = (Desktop) producto;
                    if (funcion == 3){
                        product.navegar();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else if (funcion == 6){
                        product.jugar();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("Laptop")){
                    Laptop product = (Laptop) producto;
                    if (funcion == 3){
                        product.navegar();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else if (funcion == 6){
                        product.jugar();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("SmartTV")){
                    SmartTV product = (SmartTV) producto;
                    if (funcion == 3){
                        product.navegar();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("Tablets")){
                    Tablets product = (Tablets) producto;
                    if (funcion == 2){
                        product.tomarFoto();
                    }
                    else if (funcion == 3){
                        product.navegar();
                    }
                    else if (funcion == 4){
                        product.reproducirVideo();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                else if (tipo.equalsIgnoreCase("SmartWatch")){
                    SmartWatch product = (SmartWatch) producto;
                    if (funcion == 1){
                        product.llamar();
                    }
                    else if (funcion == 2){
                        product.tomarFoto();
                    }
                    else if (funcion == 5){
                        product.portable();
                    }
                    else{
                        System.out.println("Este dispositivo no tiene esta funcionalidad");
                    }
                }
                paso = true;
            }
        }
        if (paso == false){
            System.out.println("No se encontro el articulo");
        }
    }

    /**
     * Calculamos el total a pagar al final
     * @return
     */
    public double Total(){
        double total = 0;
        for (int a = 0; a < carrito.size(); a++){
            Producto product = carrito.get(a);
            total += product.getPrecio();
        }
        return total;
    }

    /**
     * Enviamos la lista de producto
     * @return
     */
    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    /**
     * Enviamos la lista de sucursales
     * @return
     */
    public ArrayList<Sucursal> getSucursales() {
        return Sucursales;
    }

    /**
     * Enviamos la lista del carrito
     * @return
     */
    public ArrayList<Producto> getCarrito() {
        return carrito;
    }
}
